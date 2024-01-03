package test;
public class pinNoLength {
public int count=0;
public int length(int pinNo)
{
	while(pinNo>0) {
		pinNo=pinNo/10;
		count++;
	}
	return count;
}
}
