package week_3.task001;

public class GenerateScript {
    /**
     * Разработайте программу формирующую инструкцию SQL, которая
     * вставляет строки в таблицу T_GroupSelected <id_Student,
     * firstName, lastName, id_Group> из таблицы
     * T_Student<id_Student, firstName, lastName, id_Group,
     * dolgCount > тех студентов, которые относятся к некоторой группе
     * (строковый параметр) и количество долгов (целочисленный параметр)
     * которых превышает заданное значение.
     */
    public static String generate(String group, int dolgCount){
StringBuilder builder=new StringBuilder();
builder.append("INSERT INTO T_GroupSelected (id_Student,firstName, lastName, id_Group) " +
        "SELECT T_Student.id_Student,T_Student.firstName,T_Student.lastName,T_Student.id_Group  " +
        "FROM T_Student WHERE id_Group ='");
builder.append(group).append("'").append(" and dolgCount>").append(dolgCount);
return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(generate("MEPNI",3));
    }
}
