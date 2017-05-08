package me.sachingupta;

/**
 * Created by Sachin Gupta on 08-04-2017.
 */
public class Registers  {
    private String REGNAME;
    private short REGCODE;
    private String value;
    private byte BITS[]=new byte[16];

    public String getREGNAME() {
        return REGNAME;
    }

    public void setREGNAME(String REGNAME) {
        this.REGNAME = REGNAME;
    }

    public short getREGCODE() {
        return REGCODE;
    }

    public void setREGCODE(short REGCODE) {
        this.REGCODE = REGCODE;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public byte[] getBITS() {
        return BITS;
    }

    public void setBITS(byte[] BITS) {
        this.BITS = BITS;
    }

    public byte getBIT(int i){
        return BITS[i];
    }
    public void setBIT(byte val,int i){
        this.BITS[i]=val;
    }
}
