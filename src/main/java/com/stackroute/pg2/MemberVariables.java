package com.stackroute.pg2;

public class MemberVariables {
    public static void main(String args[]){
        Member member=new Member("sneha",23,50000.23);
        System.out.println(member.getName());
        System.out.println(member.getAge());
        System.out.println(member.getSalary());
    }
    public  static class Member{

        String name;
        int age;
        double salary;
        Member(String name,int age,double salary){
            this.name=name;
            this.age=age;
            this.salary=salary;
        }
        private String getName(){
            return name;
        }
        private int getAge(){
            return age;
        }
        private double getSalary(){
            return salary;
        }
    }
}
