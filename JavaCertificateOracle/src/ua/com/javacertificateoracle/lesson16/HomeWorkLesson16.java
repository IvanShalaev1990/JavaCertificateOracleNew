package ua.com.javacertificateoracle.lesson16;

public class HomeWorkLesson16 {
    /*Создать класс который принемат строку с e-mail пользователя
     и выводит на экран какой почтой пользуется пользователь*/
    public static void userMail(String userMail){
        //Создаем переменную в которую будем передавать посимвольно значение параметра метода
        char c;
        //Создаем цикл в котором будем проверять посимвольно параметр меода
        for (int i = 0; i < userMail.length(); i++) {
            //Передаем в переменную символ с индексом i из параметра метода
            c = userMail.charAt(i);
            //Создаем проверку для поиска интересующего нас символа
            OUTER:
            if (c == '@'){
                /*Когда мы находим нужный нам символ то мы выводим на экран
                символы после него*/
                for (int j = 1; ; j++) {
                    c = userMail.charAt(i+j);
                    /*Создаем проверку чтобы выводить символы на экран
                    только до того момента пока не встретим '.'*/
                    if (c == '.') {
                        //После того как встречаем символ '.' переносим курсор на новую строчку
                        System.out.println();
                        //Выходим из проверки OUTER
                        break OUTER;
                    }
                    System.out.print(c);
                }
            }
        }
    }
    public static void userMailTwo(String s){
        int a =0;
        int b =0;
        int c =0;
        while (c < s.length() - 1){
            a = s.indexOf("@", c);
            b = s.indexOf(".", c);
            c= s.indexOf(";", c + 1);
            System.out.println(s.substring(a + 1, b));
        }
    }
}
