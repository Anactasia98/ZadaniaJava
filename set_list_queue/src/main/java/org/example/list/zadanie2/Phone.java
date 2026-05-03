package org.example.list.zadanie2;

import org.example.list.zadanie2.Contact;

import java.util.ArrayList;
import java.util.List;

import static javax.swing.UIManager.get;

public class Phone {
    static List<String> contact= new ArrayList<>();


    //    для добавления нового контакта
public static void myAdd(String avatar, String firstname, String lastname, String phoneNumber){
    Contact contact=new Contact();
    contact.setAvatar(avatar);
    contact.setFirstname(firstname);
    contact.setLastname(lastname);
    contact.setPhoneNumber(phoneNumber);

}
//    удаления контакта,
    public static void remove(int index){
        for (int i = 0; i < contact.size(); i++) {
            if (contact.get(i).equals(index)){
                contact.remove(i);
                i+=1;
            }
        }
    }
//    обновление данных контакта,
//    возвращение всех контактов,
    public static void returnAll (List<String> contact){
        System.out.println(contact);
    }
//    возвращение всех контактов с одинаковой фамилией.
public static void returnAllFirstName (String firstname){
    for (int i = 0; i < contact.size(); i++) {
        if (contact.get(i).equals(firstname)){
            System.out.println(get(i));
            i+=1;
        }
    }
    System.out.println(contact);
}
//    методы call(Contant contact) который будет выводить в консоль, что идет звонок по “такому-то” номеру телефона.
    public static void call(String phoneNumber){
        System.out.println("Идет вызов абонента с номером " + phoneNumber);
    }


}
