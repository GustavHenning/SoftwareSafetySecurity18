package tinder;

public class NodeChuck {
    public jif.lang.Principal user;
    public int distance;
    public NodeChuck next;
    
    public NodeChuck tinder$NodeChuck$(final jif.lang.Principal user,
                                       final int distance) {
        this.jif$init();
        {
            this.user = user;
            this.distance = distance;
            this.next = null;
        }
        return this;
    }
    
    public void add(final NodeChuck node) {
        if (this.next == null) {
            this.next = node;
            return;
        }
        NodeChuck n = this.next;
        while (n != null && n.next != null) { n = n.next; }
        if (n == null) { n = node; } else { n.next = node; }
    }
    
    public static NodeChuck append(final NodeChuck a, final NodeChuck b) {
        if (a == null) return b;
        a.add(b);
        return a;
    }
    
    public static final String jlc$CompilerVersion$jif = "3.5.0";
    public static final long jlc$SourceLastModified$jif = 1523885607000L;
    public static final String jlc$ClassType$jif =
      ("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" + "AA==");
    
    public NodeChuck() { super(); }
    
    private void jif$init() {  }
    
    public static final String jlc$CompilerVersion$jl = "2.7.1";
    public static final long jlc$SourceLastModified$jl = 1523885607000L;
    public static final String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAJV6a+zs2H3Q3Lu7dzebTfYBeTRNtrfJTUji5toee8Z2l1Bm" +
       "PGPPeGyPx++ZNl38HL/t8dsOi9qiNimVUlo2oUg0qtQgkSi0AqniAyr0C9Cq" +
       "VSUQ4vGBth+QAJVI9APwBSie+f/v/d979+4CI/mc43N+53d+73OOf/Pd742e" +
       "K/LR3SyNumOUlvfLLnOK+4KRF45NRkZRyEPHm9bXAfDtv/njr/yDZ0YvH0Yv" +
       "+4lUGqVvkWlSOm15GL0UO7Hp5MXMth37MHo1cRxbcnLfiPx+AEyTw+i1wj8m" +
       "RlnlTiE6RRrVZ8DXiipz8suaDzrZ0UtWmhRlXlllmhfl6BU2MGoDrEo/Alm/" +
       "KN9gR3dc34ns4jT6K6Nb7Og5NzKOA+CH2QdcgBeMIHXuH8Bf9Acyc9ewnAdT" +
       "ng39xC5HP/DkjIcc39sMAMPU52On9NKHSz2bGEPH6LUrkiIjOYJSmfvJcQB9" +
       "Lq2GVcrRx94V6QD0QmZYoXF03ixHH30STrgaGqDedxHLeUo5+tCTYBdMbT76" +
       "2BM6e0Rb3+P//Ne+nKyS2xeabceKzvQ/N0x6/YlJouM6uZNYztXElz7PfsP4" +
       "8G9+9fZoNAB/6AngK5h/+Jf/5C/+0Ou/9dtXMN//FJitGThW+ab1LfOD/+Lj" +
       "5OeIZ85kvJClhX82hcc4v2hVuB55o80GW/zwQ4znwfsPBn9L/Gf7n/iO88e3" +
       "Ry+uR3esNKriwapetdI48yMnp53EyY3Ssdej9zmJTV7G16PnhzbrJ85V79Z1" +
       "C6dcj56NLl130sv7ICJ3QHEW0bND20/c9EE7M0rv0m6z0Wj0/PCMPjI8zwzP" +
       "Z6/rj5ajjxe59YXAd8FyMBonB/nUdkivssL7Q2dWjjTQcAswLL37hQN6aeyA" +
       "R9ADj56TJIPpgEe/BKXULRsjdyTDdcpOcqwq98sOxsH3Qt2eSftAc+vWILWP" +
       "P+nB0WDuqzQaJr1pvV3Nl3/ya2/+7u2HNnzN1OBdV4jvP0Q8unXrgvDPnk38" +
       "SgWDAMPBMQffe+lz0peYv/TVTw6Mt1nz7MD+GfTek5Z447/roWUM5vWm9fJX" +
       "/tN///VvvJXe2GQ5uvcOV3nnzLOpf/JJ5vLUcuwhlNyg//xd4zfe/M237t0+" +
       "6+19QwQpjUHHgzu+/uQaj5n8Gw/Cx1kgt9nR+900j43oPPTA518svTxtbnou" +
       "Un//pf3BPx1+t4bnf5+fs3WcO871ECPIa8u8+9A0s+xKY2fpPsHRJVR9Ucp+" +
       "+d/+/n9Gbp8peRDVXn4k/ElO+cYjnnRG9tLFZ169UZacO84A9+9/SfgbX//e" +
       "V370oqkB4lNPW/DeuTzTaQz0pflP//bp3/3hH3zrX92+0W45upNVZuRbF8oH" +
       "Qx995mapwcmiwdEHSop7ShKntu/6hhk5Z0v5ny9/Gv6N//K1V67UHQ09V8LL" +
       "Rz/0f0dw0/9989FP/O6P/4/XL2huWecgfyOOG7CryPFnbjDP8tzoznS0P/kv" +
       "P/G3/rnxy0MMGvy+8Hvn4sqjC3ujC1fARZefuZSff2LsC+fi+9vL2Icu/XeK" +
       "d0ZR6rwd3djiAfzu3/4Y+Rf++EL0jS2ecXysfaerqsYjbjL+Tvzfbn/yzj+9" +
       "PXr+MHrlshMaSakaUXXW6mHYywryupMdfeCx8cf3pasg/MZDX/v4k37wyLJP" +
       "esFNiBjaZ+hz+/lHDX8QxAtnIf254TlLRbqu0fPoK9m5fLW9Nbo0kMuU18/F" +
       "Jx/OvjW6DqjnWch1/YVHZpejZ6tiOFKcX14bWBvi3f0zY4Pz+4nlZ0Z05Uvn" +
       "EnycqHvD89zwdNf1l55C1A+/J1HnWT92XauPEfWC7V/J7ClmMFAWD45ZX2+m" +
       "zlff/mt/ev9rb99+5MTxqXds+o/OuTp1XOT84sXf2mGVH3yvVS4zqP/462/9" +
       "o7/71leuduTXHt8/l0kV/71//b9+7/4v/dHvPCX+PzOcjd5VkJ852/vw/Mp1" +
       "/VNPEST1noI8z/rJ6/rLj2s3GU6Ol5UfWf6K6VtD2HkOuT+5D53fN1cLXMof" +
       "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" +
       "Gr3Ket97mPW+d0OU+zgrrwzP8HJrd12v");
    public static final String jlc$ClassType$jl$1 =
      ("//9YOU9ZXdfzd2fl1lW69cqkzmX9HlxcilM5esaw7aemC+rUt5/g5eXz7PvD" +
       "c3eQ2B9c1//kXXh5MtdyEfGnz8W2fZzFD15j+sfX9d//f9LWB274/KvvwedP" +
       "n4u3ytEdI8ucxH5XFb36gJoHdTn6kXdm33/47qkyCv9UpaXz2Sz366Hz7llS" +
       "dweHvucnfvnZz9398t0f/ZJ0963PPUzVP1Uet8rR89cYbuQxeqDyx0g5j/5s" +
       "lr0Hlz//HmO/cC6+Uo5eeEDi+b1vB/9/aLnnxPdH3/H3ras/GVm/9s2XX/jI" +
       "N5V/c/lXxMM/At1hRy+4VRQ9muV9pH0nyx3Xv6x/5yrneyWMrw+auPKb89s3" +
       "sqek0q6Szu3/AUOq7JZWJgAA");
}
