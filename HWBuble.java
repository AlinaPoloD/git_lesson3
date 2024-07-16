pa ckag HW; im port java.io.File;im port java.io.FileWriter;im port java.io.FileReader;im port java.io.BufferedReader;im port java.io.IOException;im port java.util.Arrays;im port java.text.SimpleDateFormat;im port java.util.Date;im port java.util.logging.FileHandler;im port java.util.logging.Logger;

//После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt'
//в  формате год-месяц-день час:минуты {массив на данной итерации}.
// 
//Дл я логирования использовать логгер logger класса BubbleSort.
clas s BubbleSort{private static File log;vate static FileWriter fileWriter;

public static void sort(int[]mas)throws IOException{for(int i=0;i<mas.length;i++){for(int j=0;j<mas.length-1;j++){if(mas[j]>mas[j+1]){int temp=mas[j];[j]=mas[j+1];[j+1]=temp;

}

}teArrToFile(mas,);

}

}

static void writeArrToFile(int[]dataArr,String fileName){

try(FileWriter fw=new FileWriter(fileName)){for(Integer num:dataArr){

//в формате год-месяц-день час:минуты {массив на данной итерации}.
write(Integer.toString(num));append(System.lineSeparator());

flush();ger.info("Data saved!");(IOException e){logger.warning(e.getMessage());
// Level.WARNING, e.getMessage());
}

}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class HWBuble {
  //
  public static void main(String[] args) throws IOException {
    int[] arr = {};
 
       if (args.length == 0) {
    // При отправке кода на Выполнение, вы можете варьировать эти параметры
    = new int[]{9, 4, 8, 3, 1};
   {
    arr = Arrays.stream(args[0].split(", "))
        .mapToInt(Integer::parseInt)
   Array();
   
 
       BubbleSort ans = new BubbleSort();
   .sort(arr);
 
       try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
    String line;
   le ((line = br.readLine()) != null) {
    System.out.println(line);
   
    (IOException e) {
    e.printStackTrace();
   
   
}  