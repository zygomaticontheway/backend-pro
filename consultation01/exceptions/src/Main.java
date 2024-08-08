public class Main {
    public static void main(String[] args) throws Exception {
        //exception - объект, который рождается в системе в результате появления события, вызывающего исключение
        // все объекты exception являются наследниками класса Exception (Throwable)
        //его удобно использовать, т.к. он ничего не стоит пока не возникнет exception
        //exception поднимается вверх до первого обработчика по иерархии вызова методов, которые к нему привели
        // и если обработчиков нет, то JVM его обработает, вернет ошибку и завершает выполнение всей программы

        System.out.println(div(6,0));

    }

    public static int div(int a, int b) throws Exception {

        int result =0;

//        m1();

        try {
            result = a / b;
        } catch (ArithmeticException e) {
            throw new MyProgramException("Division by zero", a, b);
        }
        //можно детализировать дальше по иерархии
        catch (Exception e) {
            System.out.println("error: " +  e.getMessage());
        }

            return result;
    }

    public static void m1 () throws Exception {
        throw new Exception();
    }
}
