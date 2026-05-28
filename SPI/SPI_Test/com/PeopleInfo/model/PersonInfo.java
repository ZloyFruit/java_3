package com.PeopleInfo.model;

public class PersonInfo {
    private String surname;
    private String name;
    private String patronymic;
    private int age;
    private String hometown;
    private Nationality nationality;
    private double height;
    private double weight;

    public PersonInfo(String surname, String name, String patronymic,
        int age, String hometown, Nationality nationality,
        double height, double weight) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
        this.hometown = hometown;
        this.nationality = nationality;
        this.height = height;
        this.weight = weight;
    }

    public enum Nationality {
        UNDEFINED, RUSSIAN, AMERICAN, BRITISH, FRENCH, ESTONIAN, CANADIAN, BRAZILIAN, NONE
    }

    public void printExistedInfo(int count) {
        System.out.printf("%nИнформация о %d человеке:%n", count);

        if (!"???".equals(surname))
            System.out.printf("Фамилия: %s%n", surname);
        if (!"???".equals(name))
            System.out.printf("Имя: %s%n", name);
        if (!"???".equals(patronymic))
            System.out.printf("Отчество: %s%n", patronymic);
        if (age != -1)
            System.out.printf("Возраст: %d%n", age);
        if (!"???".equals(hometown))
            System.out.printf("Родной город: %s%n", hometown);
        if (nationality != Nationality.UNDEFINED) {
            switch (nationality) {
                case RUSSIAN:
                    System.out.printf("Национальность: Russian%n");
                    break;
                case AMERICAN:
                    System.out.printf("Национальность: American%n"); 
                    break;
                case BRITISH:
                    System.out.printf("Национальность: British%n");    
                    break;
                case FRENCH:
                    System.out.printf("Национальность: French%n");    
                    break;
                case ESTONIAN:
                    System.out.printf("Национальность: Estonian%n");    
                    break;
                case CANADIAN:
                    System.out.printf("Национальность: Canadian%n");    
                    break;
                case BRAZILIAN:
                    System.out.printf("Национальность: Brazilian%n");    
                    break;
                case NONE:
                    System.out.printf("Национальность: Нет%n");    
                    break;
                default:
                    break;
            }
        }
        if (height != -1.)
            System.out.printf("Рост: %.1f см%n", height);
        if (weight != -1.)
            System.out.printf("Вес: %.1f кг%n", weight);
    }
}
