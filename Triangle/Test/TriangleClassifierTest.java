import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testCheckTriangle1() {
        int edge1=2;
        int edge2=2;
        int edge3=2;
        String expected = "Tam giác đều";
        TriangleClassifier triangleClassifier = new TriangleClassifier();
            String result = triangleClassifier.checkTriangle(edge1,edge2,edge3);
            assertEquals(expected,result);
    }

    @Test
    void testCheckTriangle2(){
        int edge1 = 2;
        int edge2 = 2;
        int edge3 = 3;
        String expected = "Tam giác cân";
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.checkTriangle(edge1,edge2,edge3);
        assertEquals(expected,result);
    }

    @Test
    void testCheckTriangle3(){
        int edge1 = 3;
        int edge2 = 4;
        int edge3 = 5;
        String expected = "Tam giác thường";
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.checkTriangle(edge1,edge2,edge3);
        assertEquals(expected,result);
    }

    @Test
    void testCheckTriangle4(){
        int edge1 = 8;
        int edge2 = 2;
        int edge3 = 3;
        String expected = "Đây không phải tam giác";
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.checkTriangle(edge1,edge2,edge3);
        assertEquals(expected,result);
    }

    @Test
    void testCheckTriangle5(){
        int edge1 = -1;
        int edge2 = 2;
        int edge3 = 1;
        String expected = "Đây không phải tam giác";
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.checkTriangle(edge1,edge2,edge3);
        assertEquals(expected,result);
    }

    @Test
    void testCheckTriangle6(){
        int edge1 = 0;
        int edge2 = 1;
        int edge3 = 1;
        String expected = "Đây không phải tam giác";
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String result = triangleClassifier.checkTriangle(edge1,edge2,edge3);
        assertEquals(expected,result);
    }
}