package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager{
    //Наш объект connection, который хранит данные по подключению. Вся движуха идет через него. Что-то на подобие Socket.
    private Connection connection;

    public void connect(){
        try{
            //Подтягиваем драйвер, который мы добавили в самом начале урока
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Создаем подключение.
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Items?useUnicode=true&serverTimezone=UTC","root", ""
            );
            System.out.println("CONNECTED");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public ArrayList<Items> getAllItems(){
        //Создаем пустой список машин. Позже мы его будем заполнять данными из БД
        ArrayList<Items> items = new ArrayList<>();
        try{
            //Готовим наш запрос в базу данных
            PreparedStatement st = connection.prepareStatement("SELECT * FROM Items");

            //При запуске данного запроса мы в ответ получаем объект класса ResultSet. Стоит сохранить его в переменную rs.
            ResultSet rs = st.executeQuery();

            //По сути, ResultSet - это и есть наша таблица. Через цикл мы пробежимся по каждой строке данной таблицы
            while (rs.next()){
                //Получаем данные по каждой колонке. Конвертируем их в привычные нам переменные
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                double price = rs.getInt("price");


                //Добавляем новую машину в список
                items.add(new Items(id,name,price));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return items;
    }

    public void addItems(Items items){
        try{
            //Готовим наш запрос. В полях VALUES(), оставляем ?, чтобы указать, что туда скоро будут добавлены данные.
            //Это нужно, чтобы мы могли удобно вставить данные объекта car в наш запрос
            PreparedStatement st = connection.prepareStatement("INSERT INTO Items(id, name, price) values(NULL,?,?)");

            //Вводим данные машины в эти вопросительные знаки. Сначала указываем номер знака и потом само значение
            st.setString(1,items.getName());
            st.setDouble(2,items.getPrice());


            //Запускаем запрос на добавление данных
            st.executeUpdate();

            st.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateItems(Items items){
        try{
            //Готовим наш запрос. В полях VALUES(), оставляем ?, чтобы указать, что туда скоро будут добавлены данные.
            //Это нужно, чтобы мы могли удобно вставить данные объекта car в наш запрос
            PreparedStatement st = connection.prepareStatement("UPDATE Items set name = ?, price = ? where id = ?");

            //Вводим данные машины в эти вопросительные знаки. Сначала указываем номер знака и потом само значение
            st.setString(1, items.getName());
            st.setDouble(2, items.getPrice());
            st.setLong(3, items.getId());

            //Запускаем запрос на обновление данных
            st.executeUpdate();

            st.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteItems(Long id){
        try{
            //Готовим наш запрос. В полях VALUES(), оставляем ?, чтобы указать, что туда скоро будут добавлены данные.
            //Это нужно, чтобы мы могли удобно вставить данные объекта car в наш запрос
            PreparedStatement st = connection.prepareStatement("DELETE FROM Items where id = ?");

            //Вводим данные машины в эти вопросительные знаки. Сначала указываем номер знака и потом само значение
            st.setLong(1, id);
            //Запускаем запрос на удаление данных
            st.executeUpdate();

            st.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}