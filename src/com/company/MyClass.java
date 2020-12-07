package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MyClass {

    private static class Person  implements Comparable<Person>{
        private Integer age;
        private String name;

        public Person(String name, Integer age){
            this.name = name;
            this.age = age;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Person person) {
            int compareResult =getAge().compareTo(person.getAge());// if 0 equals
            if (compareResult == 0) {
                compareResult = getName().compareTo(person.getName());
            }
            return compareResult;
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();
            result.append("Name:");
            result.append(getName());
            result.append(" Age:");
            result.append(getAge());
            return result.toString();
        }
    }

    public static void main(String args[]) {
        List<Person> li = new ArrayList<Person>();

        li.add(new Person("Ali", 35));
        li.add(new Person("Veli", 25));
        li.add(new Person("Hasan", 27));
        li.add(new Person("Ahmet", 27));


        Collections.sort(li);

        for(Person p : li) {
            System.out.println(p.toString());
        }
    }
}