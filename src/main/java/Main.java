public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("у " + mom + " есть сын, " + "\n" + son);

        try { Person dad = new PersonBuilder()
                .setName("Иван")
                .setAge(50)
                .build();
            // Не хватает обяхательных полей
//            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try { Person grandMa = new PersonBuilder()
                .setName("Зинаида")
                .setSurname("Душанова")
                .setAge(-100)
                .build();
            // Возраст недопустимый
//            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}