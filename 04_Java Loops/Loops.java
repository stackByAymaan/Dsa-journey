public class Loops {

    public static void main(String[] args) throws InterruptedException {

        String[] frames = {
            "[....................]",
            "[##..................]",
            "[####................]",
            "[######..............]",
            "[########............]",
            "[##########..........]",
            "[############........]",
            "[##############......]",
            "[################....]",
            "[##################..]",
            "[####################]"
        };

        System.out.println("INITIALIZING SYSTEM...\n");
        Thread.sleep(800);

        for (int i = 0; i < 3; i++) {

            for (String frame : frames) {

                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.println();
                System.out.println("      SYSTEM BOOT");
                System.out.println();
                System.out.println("Loading modules...");
                System.out.println(frame);

                Thread.sleep(120);
            }

            System.out.println("\nACCESS GRANTED");
            Thread.sleep(500);

            System.out.print("\033[H\033[2J");
            System.out.flush();

            for (int j = 0; j < 8; j++) {
                System.out.println(
                    (int)(Math.random() * 9000 + 1000)
                    + "  "
                    + (char)(Math.random() * 26 + 'A')
                    + (char)(Math.random() * 26 + 'A')
                    + "  "
                    + (int)(Math.random() * 900)
                );

                Thread.sleep(100);
            }
        }

        System.out.println();
        System.out.println("==================================");
        System.out.println("       SYSTEM ONLINE");
        System.out.println("==================================");
    }
}