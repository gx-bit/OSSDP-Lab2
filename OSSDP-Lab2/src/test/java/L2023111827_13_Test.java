import org.junit.Test;
import static org.junit.Assert.*;
public class L2023111827_13_Test {
    private Solution solution = new Solution();
    @Test
    public void testBasicSorting() {
        int[] nums = {2, 0, 1};
        int[] expected = {0, 1, 2};
        solution.sortColors(nums);
        assertArrayEquals("Basic sorting", expected, nums);
    }
    @Test
    public void testAlreadySorted() {
        int[] nums = {0, 1, 2};
        int[] expected = {0, 1, 2};
        solution.sortColors(nums);
        assertArrayEquals("Already sorted", expected, nums);
    }
    @Test
    public void testWithDuplicates() {
        int[] nums = {1, 2, 0, 1, 2, 0};
        int[] expected = {0, 0, 1, 1, 2, 2};
        solution.sortColors(nums);
        assertArrayEquals("With duplicates", expected, nums);
    }
    @Test
    public void testAllZeros() {
        int[] nums = {0, 0, 0};
        int[] expected = {0, 0, 0};
        solution.sortColors(nums);
        assertArrayEquals("All zeros", expected, nums);
    }
    @Test
    public void testAllOnes() {
        int[] nums = {1, 1, 1};
        int[] expected = {1, 1, 1};
        solution.sortColors(nums);
        assertArrayEquals("All ones", expected, nums);
    }
    @Test
    public void testAllTwos() {
        int[] nums = {2, 2, 2};
        int[] expected = {2, 2, 2};
        solution.sortColors(nums);
        assertArrayEquals("All twos", expected, nums);
    }
    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int[] expected = {};
        solution.sortColors(nums);
        assertArrayEquals("Empty array", expected, nums);
    }
    @Test
    public void testSingleElement() {
        int[] nums = {1};
        int[] expected = {1};
        solution.sortColors(nums);
        assertArrayEquals("Single element", expected, nums);
    }
}