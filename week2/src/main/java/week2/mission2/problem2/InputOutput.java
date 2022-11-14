package week2.mission2.problem2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputOutput {
    static String filePath = "/Users/newp/study/codesquard-pre/masters-pre/missions/src/main/java/week2/mission2/problem2/input.txt";

    public static void saveContents(List<Student> students) throws IOException {
        File file = new File(filePath);
        BufferedWriter bw = new BufferedWriter(new FileWriter(file,false));

        if(file.isFile() && file.canWrite()){
            bw.write("이름\t학번\t전공과목\t국어\t수학\t영어");
            bw.newLine();
            //쓰기
            for (Student student : students) {
                bw.write(student.getName()+"\t"+student.getId()+"\t"+student.getMajor()+"\t");
                List<Subject> subjects = student.getSubjects();
                for (Subject subject : subjects) {
                    bw.write(subject.getName()+"\t"+subject.getScore()+"\t");
                }
                bw.newLine();
            }
            bw.flush();
            bw.close();
        }
    }

    public static List<String> getContents() {
        List<String> contentsLines = null;
        try {

            //file을 가져와 file 객체 생성
            File aText = new File(filePath);

            //file 입력 스트림을 생성
            FileReader fr = new FileReader(aText);

            //스트림으로 입력 버퍼를 생성
            BufferedReader br = new BufferedReader(fr);

            contentsLines = new ArrayList<String>();

            String line = "";

            //텍스트 내용을 한 줄씩 읽어와 aLine에 담고, 이를 aLines에 add 함.
            while((line = br.readLine()) != null) {
                contentsLines.add(line);
            }

            //버퍼를 닫아줌 ( 파일을 닫아줌 )
            br.close();


        } catch(Exception e) {
        }
        return contentsLines;
    }

    static void addStudents(School school, String content) {
        String[] s = content.split("\t");
        List<Subject> scores = new ArrayList<>();
        for (int j = 3; j < s.length-1; j += 2) {
            Subject subject = new Subject(s[j], s[j + 1]);
            scores.add(subject);
        }
        Student student = school.initStudent(s[0], s[2], scores);
    }

}
