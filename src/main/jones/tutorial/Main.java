package jones.tutorial;

import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;
public class Main {
public static void main(String[] args){
System.out.println("hi  this from gradle jones tutorial");
System.out.println(StringUtils.swapCase(Arrays.toString(args)));
}
}