public class Main {
    public static void main(String[] args) {
        char[] universityInfo = {'n', 'l', 't', 'u', ' ', 'k', 'n', 'i', 't', ' ', 'i', 'p', 'z'};

        String university = new String(universityInfo, 0, 9); // "NLTU KNIT"
        System.out.println("Завдання 2: " + university);

        StringBuilder mirrored = new StringBuilder(new String(universityInfo));
        System.out.println("Завдання 3: " + mirrored.reverse().toString());

        String upperCaseString = new String(universityInfo).toUpperCase();
        System.out.println("Завдання 4: " + upperCaseString);

        String institute = new String(universityInfo, 0, 4); // "NLTU"
        System.out.println("Завдання 5: " + institute);

        String combined = new String(universityInfo) + mirrored.reverse().toString();
        System.out.println("Завдання 6: " + combined);

        char characterToFind = 'I';
        int firstIndex = new String(universityInfo).indexOf(characterToFind);
        int lastIndex = new String(universityInfo).lastIndexOf(characterToFind);
        System.out.println("Завдання 7: Перший index: " + firstIndex + ", Ластовий index: " + lastIndex);

        StringBuffer personalDetails = new StringBuffer("Бабяк Микола Олегович 19 12 2005");
        System.out.println("Завдання 8: " + personalDetails);

        personalDetails.delete(21, 26); // Видаляємо "01 01"
        System.out.println("Завдання 9: " + personalDetails);

        personalDetails.append(" Децембер");
        System.out.println("Завдання 10: " + personalDetails);

        personalDetails.insert(28, " Хлоп");
        System.out.println("Завдання 11: " + personalDetails);


        int length = personalDetails.length();
        int byteLength = personalDetails.toString().getBytes().length;
        System.out.println("Завдання 12: Довжина в символах: " + length + ", Довжина в байтах: " + byteLength);


        personalDetails.setLength(19);
        System.out.println("Завдання 13: " + personalDetails);

        StringBuffer surname = new StringBuffer("Бабяк");
        System.out.println("Завдання 14: " + surname.reverse().toString());
    }
}
