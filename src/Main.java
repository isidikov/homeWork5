public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenseType("Воздушный шит");

        System.out.println("BOSS INFO :");
        System.out.println("Здоровье босса: " + boss.getHealth());
        System.out.println("Атака босса: " + boss.getDamage());
        System.out.println("Защита босса: " + boss.getDefenseType());
    }
}