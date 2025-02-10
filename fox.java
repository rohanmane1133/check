import java.io.*;

public class Copyfile

Public static void main(String args[])

throws IOException {

in = newfileReader("input.txt");
out = newfileWriter("output.txt");

try{

in = newfileReader("input.txt");

out=newfileWriter( "butpat txt");

int c;

while ((C= in.read()) != -1){

out.write(c);

} finally
 {

if (in!=null) {

in.close();
}
if(out!=null) {

out.close();
}
}
}
}