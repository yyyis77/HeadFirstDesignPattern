/**
 * Created by yangyongyi on 12/30/17.
 */
import java.io.*;

public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in){
        super(in);
    }
    public int read() throws IOException{
        int c = in.read();
        return (c==-1? c: Character.toLowerCase((char)c));
    }
    public int read(byte[] b, int offset, int len) throws IOException{
        int res = in.read(b, offset, len);
        for(int i=offset; i<res+offset; i++){
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return res;
    }
}
