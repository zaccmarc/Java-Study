package POO.ProjetoLutador;

public class UltraCombat {

    public static void main(String[] args) {
        // 1. Create an array (or List) of Lutador objects.
        Lutador l[] = new Lutador[6];

        // 2. Instantiate each Lutador with their details.
        // (Using the example data for structure)
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("UfoCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);

        // 3. Instantiate a Luta object.
        Luta uec01 = new Luta();

        // 4. Call marcarLuta() with two fighters from your array.
        System.out.println("Scheduling Fight 1...");
        uec01.marcarLuta(l[2], l[3]); // Example: Snapshadow vs Dead Code (Médio)

        // 5. Call lutar() to execute the scheduled fight.
        System.out.println("\nExecuting Fight 1...");
        uec01.lutar();

        // 6. (Optional but good) Display the status of fighters after the fight.
        System.out.println("\nFinal Status:");
        l[2].status();
        l[3].status();

        // You can create more Luta objects or reuse the same one
        // to schedule and execute more fights.
        Luta uec02 = new Luta();
        System.out.println("\nScheduling Fight 2...");
        uec02.marcarLuta(l[0], l[4]); // Example: Pretty Boy vs UfoCobol (different categories)
        System.out.println("\nExecuting Fight 2...");
        uec02.lutar();

    }
}