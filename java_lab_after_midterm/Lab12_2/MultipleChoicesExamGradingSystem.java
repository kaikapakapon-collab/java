public class GradeExam {
    public static void main(String[] args) {
        // คำตอบของนักศึกษา (ตามตัวอย่างในเอกสาร)
        char[][] answers = {
            {'A','B','A','C','C','D','E','E','A','D'},
            {'D','B','A','B','C','A','E','E','A','D'},
            {'E','D','D','A','C','B','E','E','A','D'},
            {'C','B','A','E','D','C','E','E','A','D'},
            {'A','B','D','C','C','D','E','E','A','D'},
            {'B','B','E','C','C','D','E','E','A','D'},
            {'B','B','A','C','C','D','E','E','A','D'},
            {'E','B','E','C','C','D','E','E','A','D'}
        };

        // เฉลย (กรอกให้ตรงกับ Picture 2 ของอาจารย์)
        // ถ้าอาจารย์ใช้คีย์มาตรฐาน มักเป็นชุดนี้:
        char[] keys = {'D','B','D','C','C','D','A','E','A','D'};

        // ตรวจและพิมพ์ผลคะแนนเหมือนตัวอย่าง
        for (int i = 0; i < answers.length; i++) {
            int correct = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correct++;
                }
            }
            System.out.println("Student " + i + "'s correct count is " + correct);
        }
    }
}