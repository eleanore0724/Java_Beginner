public class SimpleLiveLock {
    static class Friend {
        private final String name;
        private boolean isHelping = true;

        public Friend(String name) {
            this.name = name;
        }

        public boolean isHelping() {
            return isHelping;
        }

        public void stopHelping() {
            this.isHelping = false;
        }

        public void help(Friend other) {
            while (other.isHelping()) {
                System.out.println(name + ": 等 " + other.name + " 先動作...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {}
            }
            System.out.println(name + ": 終於可以幫忙了！");
            stopHelping();
        }
    }

    public static void main(String[] args) {
        Friend a = new Friend("Alice");
        Friend b = new Friend("Bob");

        new Thread(() -> a.help(b)).start();
        new Thread(() -> b.help(a)).start();
    }
}