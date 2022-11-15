public class Passport {
    String passportNumber;
    String surname;
    String name;
    String patronymic;
    String dateOfBirth;

    public Passport(String passportNumber, String surname, String name, String patronymic, String dateOfBirth) {
        this.passportNumber = passportNumber;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Серийный номер: " + getPassportNumber() +
                " Фамилия: " + getSurname() +
                " Имя: " + getName() +
                " Отчество: " + getPatronymic() +
                " Дата рождения: " + getDateOfBirth();
    }
}
