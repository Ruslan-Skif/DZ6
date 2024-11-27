public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        int allSalary = 2_459_000;
        int forBank = 0;
        int month = 0;
        while (forBank <= allSalary) {
            month++;
            forBank = forBank + 15000;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + forBank);
        System.out.println(" ");
        System.out.println("Task 2");
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("Task 3");
        int people = 12_000_000;
        int newPeople = 0;
        int deathPeople = 0;
        int year = 0;
        while (year < 10) {
            year++;
            newPeople = people / 1000 * 17;
            deathPeople = people / 1000 * 8;
            people = people + newPeople - deathPeople;
        }
        System.out.println("Год " + year + ", численность населения составляет " + people);
        System.out.println(" ");
        System.out.println("Task 4");
        int bankDeposit = 15000;
        int bankPersent = 7;
        int lifeMonth = 0;
        while (bankDeposit <= 12_000_000) {
            lifeMonth++;
            bankDeposit = bankDeposit / 100 * bankPersent + bankDeposit;
            System.out.println("Месяц " + lifeMonth + " сумма вклада: " + bankDeposit);
        }
        System.out.println(" ");
        System.out.println("Task 5");
        int newBankDeposit = 15000;
        int newBankPersent = 7;
        int newLifeMonth = 0;
        while (newBankDeposit <= 12_000_000) {
            newLifeMonth++;
            newBankDeposit = newBankDeposit / 100 * newBankPersent + newBankDeposit;
            if (newLifeMonth % 6 == 0) {
                System.out.println("Месяц " + newLifeMonth + " сумма вклада: " + newBankDeposit);
            }
        }
        System.out.println(" ");
        System.out.println("Task 6");
        int depositBankX = 15000;
        int persentBankX = 7;
        int monthUpDeposit = 0;
        while (monthUpDeposit <= 9 * 12) {
            monthUpDeposit++;
            depositBankX = depositBankX / 100 * persentBankX + depositBankX;
            if (monthUpDeposit % 6 == 0) {
                System.out.println("Месяц " + monthUpDeposit + " сумма вклада: " + depositBankX);
            }
        }
        System.out.println(" ");
        System.out.println("Task 7");
        int hardDay = 1;
        int simplyDay = 0;
        while (simplyDay <= 31) {
            simplyDay++;
            if (simplyDay == hardDay) {
                System.out.println("Сегодня пятница, " + simplyDay + "-е число. Необходимо подготовить отчет.");
                hardDay = hardDay + 7;
            }
        }
        System.out.println(" ");
        System.out.println("Task 8");
        int zeroYear = 0;
        int distance = 79;
        int beginYear = 2024 - 200;
        while (zeroYear <= beginYear + 300) {
            zeroYear++;
            if(zeroYear % distance == 0 && zeroYear > beginYear){
                System.out.println(zeroYear);
            }
        }
    }
}