package com.sivaitservices.app.transientvariable;

import lombok.Data;

import java.io.*;

public class TransientExample {

    public static void main(String[] args) throws Exception{

        TransientTest test = new TransientTest();



        //serialization
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(test);


        //de-serialization
        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        TransientTest output = (TransientTest) ois.readObject();

        System.out.println("Age"+output.getAge());
        System.out.println("UserName"+output.getUserName());
        System.out.println("Password"+output.getPassword());


    }
}

@Data
class TransientTest implements Serializable{
    private transient String password;

    transient int age=5;

    private String userName="siva";

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
