package tinder;

public class DatingApp01 {
    private double aX;
    private double aY;
    private String aP;
    private double bX;
    private double bY;
    private String bP;
    private double cX;
    private double cY;
    private String cP;
    private NodeAlice aliceLikes;
    private NodeBob bobLikes;
    private NodeChuck chuckLikes;
    
    public void updateAlice(final double x, final double y,
                            final String Phone) {
        this.aX = x;
        this.aY = y;
        this.aP = Phone;
    }
    
    public void updateBob(final double x, final double y, final String Phone) {
        this.bX = x;
        this.bY = y;
        this.bP = Phone;
    }
    
    public void updateChuck(final double x, final double y,
                            final String Phone) {
        this.cX = x;
        this.cY = y;
        this.cP = Phone;
    }
    
    public NodeAlice findAliceNeighbours() {
        NodeAlice na = null;
        int distanceBob = new Double((this.aX - this.bX) * (this.aX - this.bX) +
                                         (this.aY - this.bY) *
                                         (this.aY - this.bY)).intValue();
        int publicDistanceBob = distanceBob;
        if (distanceBob <= 10 * 10) {
            na =
              new NodeAlice().tinder$NodeAlice$(
                                jif.principals.Bob.getInstance(),
                                publicDistanceBob);
        }
        int distanceChuck = new Double((this.aX - this.cX) *
                                           (this.aX - this.cX) +
                                           (this.aY - this.cY) *
                                           (this.aY - this.cY)).intValue();
        int publicDistanceChuck = distanceChuck;
        if (distanceChuck <= 10 * 10) {
            NodeAlice toAdd =
              new NodeAlice().tinder$NodeAlice$(
                                jif.principals.Chuck.getInstance(),
                                publicDistanceChuck);
            na = NodeAlice.append(na, toAdd);
        }
        return na;
    }
    
    public void addAliceLike(final jif.lang.Principal user) {
        NodeAlice nodes = this.findAliceNeighbours();
        if (nodes == null) { return; }
        do  {
            if (nodes.user == user) {
                NodeAlice toAdd =
                  new NodeAlice().tinder$NodeAlice$(nodes.user, nodes.distance);
                this.aliceLikes = NodeAlice.append(this.aliceLikes, toAdd);
                return;
            }
            nodes = nodes.next;
        }while(nodes != null && nodes.next != null); 
    }
    
    private boolean isAliceInBobLikes() {
        NodeBob nodes = this.bobLikes;
        if (nodes == null) { return false; }
        while (nodes != null) {
            jif.lang.Principal user = nodes.user;
            if (user == jif.principals.Alice.getInstance()) {
                return true;
            } else {
                nodes = nodes.next;
            }
        }
        return false;
    }
    
    public boolean isAliceInChuckLikes() {
        NodeChuck nodes = this.chuckLikes;
        if (nodes == null) { return false; }
        while (nodes != null) {
            jif.lang.Principal user = nodes.user;
            if (user == jif.principals.Alice.getInstance()) {
                return true;
            } else {
                nodes = nodes.next;
            }
        }
        return false;
    }
    
    public String discloseNumberToAlice(final jif.lang.Principal user) {
        NodeAlice nodes = this.aliceLikes;
        while (nodes != null) {
            if (nodes.user == user) {
                if (user == jif.principals.Bob.getInstance()) {
                    if (this.isAliceInBobLikes()) { return this.bP; }
                } else
                    if (user == jif.principals.Chuck.getInstance()) {
                        if (this.isAliceInChuckLikes()) { return this.cP; }
                    }
            } else {
                nodes = nodes.next;
            }
        }
        return null;
    }
    
    public DatingApp01 tinder$DatingApp01$() {
        this.jif$init();
        {  }
        return this;
    }
    
    public static final String jlc$CompilerVersion$jif = "3.5.0";
    public static final long jlc$SourceLastModified$jif = 1524056241000L;
    public static final String jlc$ClassType$jif =
      ("H4sIAAAAAAAAAM1dC3wU1dWffSXhIY/wkGcIb4OY5SVoqUoSQEIjpAQQQjFM" +
       "difJwmZnszsbAohibdGK0hZRoVWqfvrVWhRq66O1oOVrC4ha21oLfj+0YIta" +
       "ila+2vqotfece2fmzp27k83q5/fl98s9u3fuOffe8z/nzJk7d2Z3n1FC6ZQy" +
       "fHWsqdxYl9TS5fNjTbVqKq1Fa/X4usWkqiHy/j3PRncsT77qVwrqlaJYekki" +
       "rTZpNUo3NWO06KmYsc5Q+tSsVtvVcMaIxcM1sbQxs0bpEdETaSOlxhJGuk25" +
       "RvHVKH1ipEZNGDHV0KJzU3qroYysSZKOmuO6EdY6jHBSTamtYRxKuLYqrqbT" +
       "RFIB1ppCipIpvT0W1VKGMqKGDJy1jquNWjxcy47VwLeZHSml1BTP5kcnh5Lp" +
       "7G47P7z9jqv6PBJQetcrvWOJOkM1YpEqPWGQ8dQrPVu11kYtla6IRrVovdI3" +
       "oWnROi0VU+Ox9aShnqhXitOx5oRqZFJaepGW1uPt0LA4nUmSIUKfZmWN0pOq" +
       "JBMx9JQ5nYKmmBaPmt9CTXG1OW0oA2210OnNhXqii+5EnVqqSY1oJktwTSwR" +
       "BV0IHNYcx3yBNCCsha0awcvqKphQSYVSTJGLq4nmcJ2RiiWaSdOQnjFAwUOy" +
       "Cp0JQKiRNWqz1mAog8R2tfQQadUNFQEshjJAbIaSCEpDBJQ4fM4s+PzWDYl5" +
       "CT+OOapF4jD+IsJUIjAt0pq0lJaIaJSx54Sa29WB+270KwppPEBoTNs8fvU7" +
       "syaWPH2IthkqabOwcbUWMRoi9zX2+vWwqrKLA9QE9XQMwHfMHI2/lh2Z2ZEk" +
       "jjXQkggHy82DTy/65fJND2qn/Ur3aqUgosczrcSO+kb01mQsrqUu1xJaClyk" +
       "WummJaJVeLxaKSSfa2IJjdYubGpKa0a1EoxjVYGO34mKmogIUFEh+RxLNOnm" +
       "56RqtODnjqSiKIXkXxlE/oPkfwKjgw1leVhtSofXGC3laS3cordq4eZwS7i5" +
       "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" +
       "TVMuKgpOxbYxa27BC7Fiera5BS+CAl8A");
    public static final String jlc$ClassType$jif$1 =
      ("FLzUFoOPrQbjtpjZWDEnqxhYnAzOx0ZXUFNBI8Cgb19A4BNtcA9rAfm8jNFJ" +
       "gifwFxCSJ+mAJczoeRyrBwSGxzGIWUHdUPrG0mjz1YlKj6coR7CO58rGLoTI" +
       "vjKGi3gGTCDWU7wlipU/RVnCJM1h9GJBfcFrcnZ+51pUcAOyb7YdeoPbx51V" +
       "wsm+sFHX45qa4NJy7pIlsNmaCK62t7EJ7GD0yy5dfmbrTMFtInjwNgVcvICR" +
       "NTO63AXet3MHD9YOcTsbSGpitF4E7zv5gof7YYLftZG60w2es8qeLBgnboyC" +
       "IW1gtNU12d25TxaWnfBNdSBpPaMJcbJ7853sQ8j+hD2zh9yTdVSJixgAb6Oi" +
       "9Pgyo8s8YpBkEQNYrmT0i7nFoAMex+CRsuA+Q+lnxaCqbM8EF5khALpOyEYv" +
       "YNtHxrDKhe2h3LG13pgAkloZVUVsn80X28PI/qIN5GE3toe5TCO4pdNwA+t2" +
       "SoqN9ACjrovrzzDcHBdRwuBQwUb2TUavd6F0KneUppkBDCR9g9GviCj9OV+U" +
       "Xkf2szYkr7tRej1LuMHgsIQN6X5G73BN9h+5T3aeGcBA0n2M7hAn+2G+k30P" +
       "2EP2QgKpcE32vc7CTbuinLOX0c1dCzfA8lVG+RcCClYrXzOtAikrGPcxRn8m" +
       "Gj+3ZnqFjOEIz2Ao8Xwu36OxdCSup7UFGfjhj8V6V5/sopoFKLpZK4uh7l5K" +
       "gAa97TXSUF8EEm/mhvp1SV6buVIZGpo9kIeGQ1FkKAOkU23rbMmSjMO9ZMlX" +
       "ikuWZEI4l7G5u8oCqKxnqB5l9FnBHkPn5ekqTMOTLL8gFaKrOKu4NTe01FVs" +
       "SK/ILJWuuYXoC4+6tOZGzAAVBa462GUQUMxEo5CqEI7AHf/QxaaM0IVt5sVf" +
       "aKCHQVyKBgFFiexEPoxN8luyuCBEzV4yhpt5BtRNF159BM8g4GIJSNrJqGPH" +
       "HgiUvPooN1PAa8iQ/eqjkPvVRyHnq48kt7bbHCdyePkv3p+GkX7I6CmX0j6z" +
       "E3loadYTOYzsKUZ/4EKpIY8TOUjaz+gjIkqRfFFahexrbEhWuVFaxaNkLezI" +
       "fOEcD19Iib4AH2fhoQpP+KHF4izIwrEroViBgvB9yqEGHCdBqgf3izNws32Q" +
       "6zer6O8sRR7e1bvo3F1Lfo9v9rB+C6lbjVLUlInH+Rd/c58LkimtKYbxhp5A" +
       "eiWx+/WGUkDfUQPfNtgvrrFf1UrfQ95BzwWDuB3Pn7KR5taUW+yTQ3ez893i" +
       "8CabDP0RsYbIX6dMnr3/0LiD7McILA1rHUY5/ryY+boZi2PPrvkLNrwznb6N" +
       "PBSJq+vhyTKlqEYppBkEjgF+H2VkVmmmrIJ5ZR/22tttrPXbGlAUcznVIH6N" +
       "jXvFzwjXr07wP3DWEFmjbNzy8xuKryODrFe6xdKLU5m0AT811i1ivgzI+TsU" +
       "8JtE1m944QBmJKmz32a9mZz7kQauM36Dg2/1zoU1hR8vs96mIsXMh/P7Nxjh" +
       "3A1kbgAA");
    
    public DatingApp01() { super(); }
    
    public void jif$invokeDefConstructor() { this.tinder$DatingApp01$(); }
    
    private void jif$init() {
        aliceLikes = null;
        bobLikes = null;
        chuckLikes = null;
    }
    
    public static final String jlc$CompilerVersion$jl = "2.7.1";
    public static final long jlc$SourceLastModified$jl = 1524056241000L;
    public static final String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALW8acw0W1oY9n53Zu6dDWbmkhnDMAyX4YJmaLi1dlWXByxX" +
       "VXdX195de5WNJ7Xve1V3deFJMJINiSVskcHBkc2fYCVBxCQhjqMkOI4iJzhY" +
       "ZBHxIgUviqMkxkRCFvGP2CHV7/d+y/3ud79hLOWV6jzVdc5znuWc8yzSc95f" +
       "+K27D/Xd3VtNXVzjoh7eGa5N2L9zdLs+DOjC7Xtt+fAV/6dXwNf+zT/yyf/o" +
       "A3efcO4+kVbq4A6pT9fVEE6Dc/fxMiy9sOvJIAgD5+5TVRgGatilbpHOy8C6" +
       "cu7e7NO4coexC3sl7OvifBv4Zj82YXdP88lH4e7jfl31Qzf6Q931w90nhcw9" +
       "u8A4pAUgpP3wZeHu9SgNi6Bv7/6Vu0fC3Yeiwo2XgZ8RnkgB3M8I7G/fl+Ef" +
       "TRc2u8j1wycoH8zTKhjuvvNFjKcSv80vAxbUN8pwSOqnpD5YucuHuzcfs1S4" +
       "VQyoQ5dW8TL0Q/W4UBnuPvu+ky6DPty4fu7G4VeGu299cdzxcdcy6iP3armh" +
       "DHeffnHY/UxTd/fZF9bsudX6LekHf/JHqkP12j3PQegXN/4/tCB9/gUkJYzC" +
       "Lqz88DHix79P+DPuZ375J167u1sGf/qFwY/H/OU/+tt/8Ps//1d/5fGYb3/J" +
       "GNnLQn/4iv9z3jf/j5+jv0R84MbGh5u6T29b4V2S36/q8aHny1Oz7MXPPJ3x" +
       "1vnOk86/qvw39o/+fPibr919lL173a+LsVx21af8umzSIuyYsAo7dwgD9u4j" +
       "YRXQ9/3s3RvLu5BW4eOvchT14cDefbC4//R6ff97UVG0THFT0QeX97SK6ifv" +
       "jTsk9+9Tc3d398by3H3r8nxweb7vAX7bcGcDbtQD+ZC804dAUpchEAMJECdh" +
       "VS1bA4jTAVDraLi4Xai6UThc1dAfu3S4Qhug7/wfyNIIGJb9FnbAdjktVUw2" +
       "DQi9s3xu/v+cfLpJ9k2XR48WpX/uRQNQLKflUBcL2lf8r43U7rf/4ld+9bWn" +
       "R+BBJ8tJeDz1O89Nfffo0f2U/9LtjDxew2UF8uVkL4f3419Sf5j7l3/iCx9Y" +
       "Nk9zuenvNvTtF7fyMwPALm/usj+/4n/ix/+P//sX/8xX62eberh7+z1n7b2Y" +
       "t7PyhRfF62o/DBZb9Gz673vL/Utf+eWvvv3abeE/spigwV02yXKeP/8ijXed" +
       "mS8/sT83lbwm3H0sqrvSLW5dT4zGR4ekqy/Pvtzr/WP379/8u8vfo+X5f2/P" +
       "bXvdPtzgolr6YWu/9XRvN83jNbtp9wWJ7m3dD6nNn//bv/Z/Iq/dOHliFj/x" +
       "nP1Uw+HLzx3F22Qfvz90n3q2WFoXhsu43/iZ47/x07/143/ofqWWEd/9MoJv" +
       "39obn+7CX9398V9p/87f+7s/9+uvPVvd4e71ZvSK1L/n/HPLRN/7jNRySovF" +
       "Uiyc9G/rVVkHaZS6XhHedso/+8T3QH/pH//kJx8vd7F8eay87u77v/4Ez75/" +
       "G3X3o7/6R/7p5++neeTfvMQzdTwb9tj0fMuzmcmuc683PqY/9j99x5/9b90/" +
       "vxixxXD06Rze24K7e/Hu7qVa3a/l99633/dC3w/cmm+f7vs+ff/9k/17zfD+" +
       "5s+e7UUH+IU/91n6D/zmPdPP9uJtjs9O7z2shvvcMYF/vvyd177w+l977e4N" +
       "5+6T967UrQbDLcbbqjqLM+zph4/C3Te9q//dju2xFf/y07P2uRfPwXNkXzwF" +
       "z4zE8n4bfXt/4/mNvyjiIzclfWF5PrQ85QPUbr2fbG7tp6ZHd/cvyD3K5+/b" +
       "77o1bz/ZW280XXpeTsb0dNJHt0k//DCZ+gCF5yYd7l5zrZcswbFLy+VQnB88" +
       "YfgTX/vXf/edn/zaa8+FC9/9Ho/9PM7jkOFexo/e7/VpofJdr6Jyj7H/33/x" +
       "q//5v/vVH3/sTt98t/PbVWP57//Nf/433vmZv//XX2J9Xw/q5WyFj23CrQXe" +
       "q9zXl+dPP8DLS5RLPlburcHeq8Ub1vkB1i9o0b69/eArid885i89wH/rJcT3" +
       "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" +
       "fk1YQCgnF1s6ASR/RFcsDRPBtcd2Oxgw");
    public static final String jlc$ClassType$jl$1 =
      ("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" +
       "kvrUHFf8YY+mM3vpdl1tpFR8pohru2MW+lQbR0g6S5cegU/YHHaYvOkVBQ8h" +
       "71wje0iIauJMdNSKxgovMwS9YKvDSgkAf70R8rQceNubkmZNhqk5rQCT0fNt" +
       "pJ+OkbSkwl23jyC9i07Empov5nakkGOF88p6cHVzddVOSDhvCCTd0K63PYJK" +
       "b3ushQVi1SEAKKRbXPRZgYS6g26vge5qr7zaSeHjsTvngtRd5srDpCOlcu3q" +
       "nFw1vmh3dnM7xlm8Xx1gIzfKsuxYbskvABgehqE7Wh5TkLo/VwZ7wKTMOu/n" +
       "S2Z1IH45Iltzty8zT5qvm2nku6u87fYhNgW8oK9LkNQ2EJRC6Tme2ZXW6xtu" +
       "2EElgaInquT4ckZglyidGc9P7igi2DaGAWiudShRNueewEq2t8QEOOLSlCUI" +
       "CeVeTN47h596cA7f8h7n8Db0zD1Mz2r5vvC0lu/+71bpfKute3LP583navme" +
       "q+K/u1V3f8f7XcG6r+z+uR/72s8G8l+AXnu4CvAHhruPDHXzA0V4DovnpvrY" +
       "MtN3vjCTeH/t7FlV/78n/sJfZ77X/6nX7j7wtCD/PbfX3o305XeX4X90CZHH" +
       "rtLeVYz/bU9lv5Uw3sv86bu716AH+F3PV0E+c6svqO2+BPKNB5S3HuBnX1Tb" +
       "s+sRH3hWu/iDTxv+fv5/+xU3Kf7CrfnZ4e5jYxO4w+Mi05cWD57r9PGFvT/3" +
       "bulutZ2fXVj7jQf4339j0t1Qfu0B/sq/kHS/+Arp/sNb8/PLDnks3UOt6r/z" +
       "Mjluq/SdC4k/+gCLb0yOG0r+AMN/ITn+01fI8Z/dml96ukpPi1tfKsmt6vZ7" +
       "lmN2eICf+8YkuaF8+wP89PtL8jx7/9Ur+v7rW/NfLJYjWg7v/faSwjROvHp8" +
       "XI7cvEyEb1ueH1rYGR9g8I2JcEPxH+APv78Ijx6uyt1+vzncvblYs8f1t8cu" +
       "rfy0eaj5/e9eId2v3Zq/Ntx93A0eC3crSH7ZytzXQ98sgLS8Ww8QfIVYLymG" +
       "vqEAD/CLv7eV+Z9f0fe3bs3/sAT8aX/POltRz9d5v2AA3vDqugjd6mXLBS+P" +
       "t5jcH3uA1je2XDcU8wGefm9y/YNX9N3Xif8vy457Khf9tFT81vV33k+E893d" +
       "N/0HD/BPfGMi3FD++AP8V7/ujrv9/NX7Wf/RK+T4x7fmfxvuPh2kvV/Uffi4" +
       "LFyrn94E4F+Q5HYZ5L65TcI+ge+R5Na89QrCv/2Kvn9ya/6vRbmPa+3ffu6K" +
       "6tvP1PSMpfvbvd/7RFVP4HAXvPce5u9/qx3dPm3Hegi/+Ph641s3r/PWLcpI" +
       "q3Odh9sweu4u6he/9NaPDEnav/MSXr74pS9/9UtPb3a+ZOnu/15/kbFb7z9t" +
       "mlco4P95Rd/9DaDfGe6+9f04fl+b/an3auhnvp6GHl/Se15F6XBTyVt/KDy7" +
       "xRef3Sb5Ebf0vvrWD71VjUXxpS9//1v33U/udLy089ndind3/7D61su0ir1b" +
       "q2+8RKuPHr1Kq48+9Iq+N24ff3e4+/ATIe+1OC3e8LkFv100/db3/L+Fx/8V" +
       "wP+LP/uJD/++n9X/1v0t5Kc3918X7j4cLWI9f6vyuffXmy6M0ntRX398x/Je" +
       "7kcfG+5ef7zhbr8+3jy9ffLs/sbjS57T/wfq3I+KB0IAAA==");
}
