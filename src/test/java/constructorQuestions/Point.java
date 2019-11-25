package constructorQuestions;

class Point { 
    int m_x, m_y;  
    private Point(int x, int y) {    m_x = x;    m_y = y;  } 
    public static void main(String args[])  
    { 
      Point p = new Point(10, 20); 
    } 
}