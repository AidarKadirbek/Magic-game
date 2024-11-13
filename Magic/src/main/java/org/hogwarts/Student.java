package org.hogwarts;

public class Student {
    private String name;
    private String faculty;
    private int age;
    private String[] skills = new String[3];
    public Student(String name, String faculty, int age, String[] skills) {
        this.name = name;
        this.faculty = faculty;
        this.age = age;
        this.skills = skills;
    }
    public String getName() {
        return name;
    }
    public String getFaculty() {
        return faculty;
    }
    public int getAge() {
        return age;
    }
    public String[] getSkills() {
        return skills;
    }

    public void castSpell (Spell spell) {
        if (this.age <= 11) {
            if (spell.getPower() == 1) {
                System.out.println(this.name + " использовал заклинание " + spell.getTitle());
            }
            else {
                throw new IllegalArgumentException(this.name + " еще слишком юн, чтобы использовать " + spell.getTitle());
            }
        }
        else if (this.age <= 12) {
            if (spell.getPower() == 2) {
                System.out.println(this.name + " использовал заклинание " + spell.getTitle());
            }
            else {
                throw new IllegalArgumentException(this.name + " еще слишком юн, чтобы использовать " + spell.getTitle());
            }
        }
        else if (this.age >= 17) {
            System.out.println(this.name + " может использовать любое заклинание, в том числе и " + spell.getTitle());
        }
        else {
            throw new IllegalArgumentException(this.name + " еще слишком юн, чтобы использовать " + spell.getTitle());
        }
    }

}
