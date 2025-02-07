package Tasks_9.Task8;

class Reader {
    String fullName, readerNumber, faculty, birthDate, phone;

    public Reader(String fullName, String readerNumber, String faculty, String birthDate, String phone) {
        this.fullName = fullName;
        this.readerNumber = readerNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public void takeBook(int count) {
        System.out.println(fullName + " взял " + count + " книги.");
    }

    public void takeBook(String... books) {
        System.out.print(fullName + " взял книги: ");
        for (String book : books) {
            System.out.print(book + " ");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (Book book : books) {
            System.out.print(book.getName() + " ");
        }
        System.out.println();
    }

    public void returnBook(int count) {
        System.out.println(fullName + " вернул " + count + " книги.");
    }

    public void returnBook(String... books) {
        System.out.print(fullName + " вернул книги: ");
        for (String book : books) {
            System.out.print(book + " ");
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (Book book : books) {
            System.out.print(book.getName() + " ");
        }
        System.out.println();
    }
}