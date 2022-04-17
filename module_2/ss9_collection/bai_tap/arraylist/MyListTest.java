package ss9_collection.bai_tap.arraylist;

public class MyListTest {
    public static class Teacher {
        private int id;
        private String name;

        public Teacher() {
        }

        public Teacher(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }

    public static void main(String[] args) {
        Teacher student = new Teacher(1, "Hải");
        Teacher student1 = new Teacher(2, "Chánh");
        Teacher student2 = new Teacher(3, "Chiến");
        MyList<Teacher> studentMyList = new MyList<>();

    }
}
