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
    public static final long jlc$SourceLastModified$jif = 1524057584000L;
    public static final String jlc$ClassType$jif =
      ("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" +
       "GF+MFa6zHYBUiD4hVAmhvqjFMOKamuBm");
    public static final String jlc$ClassType$jif$1 =
      ("YS5PCF1vDwRXsjrZAK5htN2jy8/sGi58uQgePKmMFwbQs8sYvdQDnpo7eHBd" +
       "jltFQFIdo/NF8HxR8gOvBdk7HKRavOC5q5zBLoKuNbIuqYw2eAabyn2wcEmH" +
       "b4ECSVcy2igOtivfwaaR/RpnZGnvYF1V4gUCwEtyoX7tjF7iE4MkFwjAMo/R" +
       "ObnFoK0+x2AWDF9HLtPtGFST7Xm7YisEwKkbZb0XsB0oY1jkwXZ77tjaTyOD" +
       "pAZGF4vY7sgX25uR/RsOkDd7sb2Zm5nDX+g13EBCrqRYT+9jdIdHaZ9duPmO" +
       "iBIGhyrWs25GdQ9Ke3NHabYVwEBSF6PrRJQeyhelB5D9MQeSB7woPZAl3GBw" +
       "WMm6tI1Rzwp++Ay2myyxAhhIupFRcQU/7N1ukuNgcctJ2NlyEvZuOXFXycIN" +
       "weCs2xg9w90YwLKeUZ/dGPL1iBqQsoZx/5zR74rGz61HXCZj+AHPYCrxfNYj" +
       "Yno6GjfS2rIMvFS/0TjTpyaoZkHZL9gLCWHxMlBcmAi/7CxMhF9BII+geb16" +
       "RvI6rYWJ8HGfQA5PTYefN5Wh0qF29rZCQfrhXaHgK8UVCjIgHMvJ3F1lGVQ2" +
       "MVQPMPqw6Cpv5esqVMN/d/ziFa+ruKq4FQq01CtZl56UWSpdoQh/RL0FyxxX" +
       "KIgZoKI64ZrNYxCkKAigUUhVCEdeg+K0JSOMKwx48Rf+7+wGURBGg4Di97KJ" +
       "fDQb5BZZXBCiZomMIcUzACkoyt0UYH8vLi6ApM2MpgVTKOiXpykU4CM6BYNt" +
       "3AuKPabgVEF5UHLbqNM1kUO6hvd+oKfHGX3Wo7TPbCIvGJ11Ioee3cvo7R6U" +
       "JuYxkYOkexjdJaJUkS9Kk5B9hgPJJC9Kk3iU+IUQjy/82scXLhR9ASpxeaKg" +
       "yBd+aDEyC7JwbAwU41DQPCzxhVWrCFL9uP/mADeyhnv+Hwz9HybRB/cMKD57" +
       "z8pX8Kl5+/+MkMu04tZMPM6/VJf7XphMaa06xps+9CZlEk8/31QK6fsf4FeV" +
       "7DWI9B2/PXQuGM7tJvwnG2luTbnFMTl0K9zv7YW3RGToP+hpjv515owFB56a" +
       "dIi96NvWsNZjVuK/7rFe5WBz7NuzdNlV71xA3/RbEI2rG+GpDaW4TimiGQT2" +
       "Af73wLis0ixZhUsqPip5qM9E+731UJRyOdVwfo2Ne33GWM8b3fl/HtQcXa9s" +
       "2vbkDaXXkk42KX30dGMqkzbh3/j0iVov2nC/4x3+34f9/3GwA3OS1NnX2G/9" +
       "5V6Azp2Mv3kYWLd7eV3R6cvtNxVIMQvg+P4PB/HT08BpAAA=");
    
    public DatingApp01() { super(); }
    
    public void jif$invokeDefConstructor() { this.tinder$DatingApp01$(); }
    
    private void jif$init() {
        aliceLikes = null;
        bobLikes = null;
        chuckLikes = null;
    }
    
    public static final String jlc$CompilerVersion$jl = "2.7.1";
    public static final long jlc$SourceLastModified$jl = 1524057584000L;
    public static final String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALW8acwsa1oY9p07c++djdnIjGEYhstwQQwFt7qruqu6PAxy" +
       "VXVtXUvX3tVl40nt+750VeOJsKUEEkvYIgPBls0fYyVBxChxHEdJcBxFTnCw" +
       "yCLHixS8KIkSGxMJWcQ/YodUf+c7yz333DOMpXxSvU91vcuzvM/2Hj3v+aXf" +
       "unu9a+/eqqt8jvKqf6ef66B7R3baLvDJ3Ok6ffnwVe9nAPDr/84f/uR/9IG7" +
       "T9h3n0hKrXf6xCOrsg+m3r77WBEUbtB2uO8Hvn33qTIIfC1oEydPrsvAqrTv" +
       "Pt0lUen0Qxt0atBV+Xgb+OluqIP2HueTj8Ldx7yq7Pp28Pqq7fq7TwqpMzrg" +
       "0Cc5KCRd/2Xh7o0wCXK/a+7+tbtHwt3rYe5Ey8DPCk+4AO9XBOnb92X4R5KF" +
       "zDZ0vODJlA9mSen3d9/14oynHL/NLwOWqW8WQR9XT1F9sHSWD3effkxS7pQR" +
       "qPVtUkbL0NerYcHS333ufRddBn2odrzMiYKv9nff9uI4+XHXMurD92K5Tenv" +
       "PvPisPuVpvbucy/s2XO79VvSD//Uj5Vs+do9zX7g5Tf6X18mfeGFSWoQBm1Q" +
       "esHjiR/7AeFnnc/+yk++dne3DP7MC4Mfj/nLf+S3/8APfuGv/urjMd/xkjFH" +
       "Nw28/qveL7gf/x8/T34J+8CNjA/VVZfcVOFdnN/vqvzQ8+WpXnTxs09XvHW+" +
       "86Tzr6r/zfnHfzH4zdfuPsLdveFV+VAsWvUpryrqJA9aJiiD1ukDn7v7cFD6" +
       "5H0/d/fm8i4kZfD46zEMu6Dn7j6Y3396o7r/vYgoXJa4ieiDy3tShtWT99rp" +
       "4/v3qb67u3tzee6+bXk+uDw/8AC/vb87g07YgVkfv9MFYFwVARiBMRjFQVku" +
       "qgFGSQ9qVdhfnDbQnDDoZy3whjbp5/UO7Frvh9IkBPtF34IW3C/WUkZ4Xa/W" +
       "7yyf6/8/F59unH3L5dGjReiff9EB5Iu1sFW+TPuq9/WBoH77L3z11157agIP" +
       "Mlks4fHS7zy39N2jR/dL/is3G3m8h8sOZItlL8b7sS9pP3r4V3/yix9YlKe+" +
       "3OR3G/r2i6r8zAFwy5uz6OdXvU/8xP/5f//yz36teqbU/d3b77G198682coX" +
       "X2SvrbzAX3zRs+V/4C3nL331V7729mu3jf/w4oJ6Z1GSxZ6/8CKOd9nMl5/4" +
       "n5tIXhPuPhpWbeHkt64nTuMjfdxWl2df7uX+0fv3j//u8vdoef7f23NTr9uH" +
       "G1xESz6o9ltPdbuuH+/ZTbovcHTv676i1X/27/z6P4Jfu1HyxC1+4jn/qQX9" +
       "l58zxdtiH7s3uk892yy9DYJl3G/8nPxv/8xv/cQfvN+pZcT3vAzh27f2Rqez" +
       "0Fe1//qvNn/37/+9X/ibrz3b3f7ujXpw88S7p/zzy0Lf9wzVYqX54ikWSrq3" +
       "jbKo/CRMHDcPbpryzz/xveu/9E9+6pOPtztfvjwWXnv3g994gWffv524+/Ff" +
       "+8P/7Av3yzzyblHimTieDXvser712cp42zrzjY7pj/5P3/mn/lvnzy5ObHEc" +
       "XXIN7n3B3T17d/dcAfd7+X337Q+80PdDt+Y7pvu+z9x//2T3XjdM3+LZM120" +
       "wV/6M58jf+Q374l+pou3NT43vddYTec5M4F+sfid1774xl977e5N++6T96HU" +
       "KXvTyYfbrtpLMOzIh4/C3be8q//dge2xF//yU1v7/It28BzaF63gmZNY3m+j" +
       "b+9vPq/4iyA+fBPSF5fn9eUpHqB+6/1kfWs/NT26u3+B76d84b797lvz9hPd" +
       "erNuk3GxjOnpoo9ui37oYTHtAQrPLdrfveZYL9kCuU2KxSjGh0gY/OTX/63f" +
       "feenvv7ac+nC97wnYj8/53HKcM/jR+51fVqwfPersNzPoP+PX/7af/7vfe0n" +
       "HofTT787+FHlUPwHf+tf/I13fu4f/PWXeN83/GqxreCxT7i14HuF+8by/MkH" +
       "eHmJcPHHwr01yHuleJs1PsDqBSmeb28//Erkt4j5Fx/gn34JcvqVyG+z/tQD" +
       "/OkXkMv3wz+9pIf3NnvT2Hcep2LvS9AXHl7+5gP8L19CkPhKgm6z/soD/Mvv" +
       "Jsi1Xi2NG/KPLM8/fYB/7yXI1Vciv836jQf4t15A/g224ob8o8tSn34M7/7F" +
       "S5CfXon8NuufP8DfeQG5fHvjX6kH37IshT7AL7wE+R96JfLbrO98gJ99N3Lv" +
       "G4j9hnz58ch+gPhLkDuvRH6b9QceIPYC8t+DBXximfa1B+i/BHn4SuS3Wd4D" +
       "/EMvIP8GYt8sz6eWaf/xA/w3X4I8eyXy26yffIB/9F3IP7Kc67wlSmdB99QM" +
       "HxJBqfID/Nb7voT94PIsivjoHz7Av/ISwtpXEnab9SsP8D95F2Efciv3XWR9" +
       "/DmyiMp9pbS+9e7utc8+ho9+8yVEza8k6jbrHz/A//Xd0vLiwcveV1rkrfc5" +
       "wm7N56dHS3R7HX5n+87q9vvHXx4BP3B7/d4lDnT3x/FlRpiUTv441ervfl+a" +
       "e28/ySLN5Xi+JDpvL4n/i4rzBOMSrz7+zJsK1XKs/eP/25/8G3/ie/7+EnsO" +
       "d6+PtyRhCVLPuVxpuJ37/41f+pnv/OjX/8Efv8/7Fv7dv/OP1j9+W/Unbs0f" +
       "W87EN0q0amgXrXG6XrxP1AL/Rsw9Cb//MQn371/pl3SvepcffyqSt+7YTcfh" +
       "T/6EtU/CF2PtFmEY6MTlso85b6dknEdc5YPWcokW034VHxSKb6jzAR10myGv" +
       "HVb4usLzG9k8NabaUarlaL3VtK5RrXu7cRDaa2c4GVDfWVldTZh9q2F006Ir" +
       "oOmv1zAIxeshu9pzKEBFD4xXOETr8hpa8hEDAQCFp+u2mzJ0LnLusNam5qqf" +
       "5lHaG1lvubnhImvLgLLeLEBKumpaM7gVAXsYgw3rY7kYJaFAvGciQWEkrWs3" +
       "vlGF0ukIMXPpwwze4MC40L1uDozc7IzEL1O3XCclVmXnxHVsQz4xxXFrtjlF" +
       "+mKOl9KpJde0qSfzmmdUqBCbzaAZqEGnoZhIdqrWh0YbIO5Mewmmm5Nkr4os" +
       "aqZ1fNBK6mJbVi1q25KH9q3m+Wekbe1qZ0TYcX1mR8CF6oM6a9eLy04rT2uc" +
       "dIDNxj6GvXmZdkdeER2aYxAuY4yrtXY4SBWpHCxqHWDNmk22Nm/uzOTUTAfG" +
       "1pWeTvZ5L5iDgKjSXtF0o65PBSY0zHk5ZZiWw2QpHBmShh3tw3HJy6Rj09Iy" +
       "YmzNrGoctatsHeLrdmen6wbB10san+un07mazshImYoO62qOxLqGnhrDWyek" +
       "A1rUlVVij4hTmCW3q2x/yVujUpkdSh9pam5qg6pqr6TWK9WuRVpCqmq1EnR8" +
       "PiTxxqad2LtQnOTWgesfnQXXBuKRgE34HmjwJBJNI65aySAOhONoOFWFcnMy" +
       "LBfdNZ2mqNMeZXsm8oAcEwuxourYdJqtq1E5I4mjExpl4B6LK7huyCQT7X3s" +
       "OaurI1njVQJPfUnUUOIaNgfN6/HkmMz1aNWytitGtfeNkNxSuk9wyIUEHECt" +
       "QNnqZmkODizTnV2bOtJxzerzZnP7NzhsHkvl0oSnwbw0kXqFFeU4VYakN1qQ" +
       "T4Lgn7VTVHs17dbVbCaSlSy7liUwMK5iym5zNIDq9HQ1o5LtnFa5SBilOmuK" +
       "4JMqYa8WhUAMpkN1McCbUQtqnqpUQEv3s+aLci6e2RPVNLPUONdmhot51JlB" +
       "9Rtpn6AqDSVSj5pVohiXdNU4bqY46TqYTsa62ieKUMTRuS8q6iweZVLbV6as" +
       "7PysT9y8qjpORlSH7/lDs8id1M05xOSNvrp0FetHCqECRapuA5k6bc9nzxNO" +
       "rATZjYlurpUsXS9qT0M4wtlbXDX9uapNHKeMI64CMUNw1DqWwkPKDOHK2kON" +
       "abnxKuQ6R0dxF1N8eWrz2Nlc453gOQAvMIi1BpyRFVDAEYd9UtG6phR17Fft" +
       "qSrc3rVMYrAJLvMVYG5otTrwl2XHex4/1ZrIVUBdHleHWFcoqnUM7qKf1ZgW" +
       "ynmPFMjs4tB2swNA1O377HhYjDUWd7jHCqSywaxOiWxDWzN4oaZjVG+DKr2G" +
       "HawrUXNWuXyWYlFMOe5YWMnRnI+y7/FZSp7wlF/2WDYrz40z/mSOhY3OQww5" +
       "Pb7RGryqrTOZ4JU/yRHSzvR22rIleFXaBtd8Yz/jBVY5EisOW3ATuTiOAMme" +
       "VYhaLzLXYf21Ge6Gvoa25wiziVN9SY8ARfHMwEFb8ZAW6WVeYeuxbLseDHY0" +
       "q3Rzol0t5Jy3mY965LzX6yOIy/kOj8HL2YlwbZjhuDvJXjrghyMrZtsZyExc" +
       "OwCM6O9X2Pl0Si6btG7d1qH6EC/l3XQ+8qIKInOokfRxtW2aJW7MrR4Qerrm" +
       "kMYUPMzbuVjOk2cldkpxZYN6Krrs5YxmTa7ysLLHEKGE5F3YyY0eKBrXJ6dt" +
       "HTpHBjd6ItQibsPqxmQqHbfjp8IkDQrZmfutoKfWYUfBEGXjIqKrJ6fayQGr" +
       "Ygchby/HnQYIV3ZxkRyBmIwGba7QQDtSqOo7EnIzqRknhgLT0+BdAtG1zzF4" +
       "BjypnSF5zCssjABUERAnr+YMc9TMTnwMW8H1IhTUaD1LSVZlcSZqIQnbTiKT" +
       "/NAfpiht1yB13g0CvnQeDgPVS5yBVHlIYWeBgCSgigeoOV77HFJ21Wa7OwtR" +
       "NqsHX4+SY1vw/AVXfXtx95ujnnHbmvOyaE85ndfoq5Df0KdqwNuRpdY55l31" +
       "AeN326ALFQjGTosb8U1LcdhhLHaCBgRsK2EedA1B3Aui/GzYRbWKT84izu3a" +
       "yq+YtMJaKGuvIxgJS3ajlj6pE5B+OA4HJMvMVRZCe1dYHHhDeKamWhEMQ/hG" +
       "D3e05AMbFPNHBDilF5ZqFAZONQM6M35GJtYUbLYXCJW3J0nthcEo5VVSUKMe" +
       "w1iHmeHGNzKRJfseBsfTyhx1cIz0eIZcbSxJwU5EMHXIrRZWIExHR45Mjrss" +
       "xWRb2QAARutW1vqVvzLQjKW9YylzkR6wKZrwnNKVlpgeyUY9kePZ0hbRRvQ6" +
       "OIUhdd30J1mEiFSJNNpSU2VTlbm0+CFxOGy4bA7Ns1sX+cqjG9/fbVsEsAGQ" +
       "78KTicyzZPOxNeB44oFXkavTDXgGc8zN827Oez5el9LeMpjWziR1dZaCPqrb" +
       "bWPEMZ7aM8GtYQMpSlKezG09yHqTp2TjFVvhvLN3AyDzfX+FIYSZnU5WSj29" +
       "XlZjwSuNmJIHTNYvYc40vkA7S77hNKfjabKODWFCPLFt5shPa2a7uOeubdSa" +
       "Mi/q8ZyT/vG4k2B7t8oyLTZJ3ej5oS463ZYdmrwSc6mE8Rrc5nwlbvLdcUMM" +
       "OVlSGDbxHbM5qVLmwiGT59fZKFd24rV4gEzy4i682uIPxuWKAthGuCbAjvCJ" +
       "+pxmvp302Xn0zVO1wy85QaE5pGHBZU7bXJD8CYON8xgkZwfy/Wp3EpP90Bf4" +
       "bnvU4O2+geNgvYurcck3xUDXL+zW3++dmQpXEXcIN10077vuYFAztKq5ZJMo" +
       "WcVEWN/jOEmui0tcndvgSBVZrYz6tS8ibhqYbgpSE0LhNcpury4Ij3A1gJDi" +
       "K1ycOC5aNcQFrCUC1k7BisjRw4y41N4ooZmJdJ6R9Ms+S9DCp4lAKA37NB92" +
       "+Z4WjXRILYDLlXaJASwwCxLXoSRL8A7LDGZy3Vn+Xl1dNmtdPY+0SwyHha69" +
       "bLKWuBPHpNphoQpkx5Ed0XZaoYZon0g+5taOTYJFuqhjsG2WhHCw5diaQAAd" +
       "NZZoQgFhjrlMwKwmlHbeFrAfBHI9Dys0wq7zpBcBrWhBPG9jQ5xsjsrqDXg9" +
       "RvEsgG08rgAZdt2GIDpVw3bW5pJpxWbDhqE8dVsHDVnb9vaqy+wPB3gxL4Is" +
       "PKE1NyWfaGF7ZR3BYpJ2TZVRJ1yCqL/4Ot2QEjIz9VCOp/MxdXfNETIgEfDs" +
       "dmTOQLDeFvucgzq3sntWHIG8NGCk6KPRHgH5vNaQsfFz02DQlBIqjFnxF2ik" +
       "92q7i5UgAqyNhjvXID1eNAppxZjgYHg2EHuvMcFG28jKOM4KHmVLgKpg7UDK" +
       "u4tVnQNlyUDZtAp2pFC0cS0I+Gpizizf1twgskyL2nxidtpuFMP6Sp5qGeA5" +
       "xsK9c+hr0qkbc7FXmS7ZjXO2qZXVOgN4g+09qUykijsMGa1GwKHZw2W0hGXX" +
       "VbN2pVNl5p7yab0px3OClQpUXhtvb0PAVhZhtdy1SuCtLVjDkTlJx4lVMsPB" +
       "Muc6QehBt7Mja4PJntjCaeDg+6zfJhi+UksdzKLd5mDv4VxhWTLZIQf3GHnX" +
       "jX2UEaE1ssZMZ6saj4OwL/dYhLEwwWoZddplR+h0uC29OlJnvKDkY7yspWy5" +
       "YzWqeMz4KSgR25UU7VVlY7DXSg38PVtDe3ZfhfZhkDVit/emqN8hnI7cr09K" +
       "Ny/KbKFKEniz85yrzYeiFIPTnpBoH+f3uzqRFekgqol3QPBlk5IgKEZb9IV1" +
       "KGm4cdlb/oWI3EUlYm5QDTJE93FCE4kU5xVXqnyUkxt4peINuk3Z7VEh41aP" +
       "Asnc5cdCWcVlwRwIhOFlAic1rbN9Db5E3v66y8yKbPkQ3eHTdB6VnLlw5knd" +
       "L6KsN7PNnCeeEsYDTQpJksqc5ZwJZV1fjkwBLE6Wc5X0ug8ijDStLCIOB4Th" +
       "IIEkYZFG6MYWQDFyZCdZE+s8Sdk4oSLp0EPHEU8XPU2UU0ILKwHvbWtJz1cc" +
       "thxPOATW11BfM6aQMpLkd7koaDh0Ev3rMr5eo1kkRV49H4b8qJYBr/HwWqkP" +
       "OhavK6V0pcixDslWQ8n2MPqFfy3UJeEhkIQGSObQ4HBqTRwW45vrEBGkVU8W" +
       "eLMTIJVhJzaxKekZnXZjNQ1MGjpHDKroHKNfNoF2DI6sporFocBrwjvTlnxR" +
       "WC8IDB1XJVdaHF1BX3194iFq8VzcZk0INihuz/2eONsKoy9+dcA2lhTsERE5" +
       "jgO8GsiY3a+BMFqTrN248pYVQdzeZka/HefdvlAYRtHAGU2w0dxVwHIYkMAe" +
       "Fyw/wdaQvMX2gTohEmhseGpeqRsa7A4VySPX07qaNDfWz14bX4+wJPb56jrI" +
       "8fqKgh1MSG447EQHhcdDLtfnqT3sgIOTT26pEiYqVYQfjwNVslZ/tLy+2O+R" +
       "xEN7EL1i5Ehcc3ZqL3kcG8yhHMvQhrujcFiZMHE4LXEDHaBwzOy6ba3YGrUd" +
       "6CB05QqoFON7DMeUXT6l2n5lMaSoZXtbSRJ2Mqa8PDDqpuKOY9ArlxjXWLIi" +
       "a2ImAxngGtkUKp/nNZmGIMJsdBs6gAXQweh05cs42aLkcVcSDb6Bax1CpeLg" +
       "SMM6W/76yRENVBJiCK48bJrRApNyWNUHMg33gT6IpnDwbTSg5w188to6rdaT" +
       "1J8MpOdUG46Ops9KTqCdbWO1QjT7FEIXHlsxQu4sfqC2T7BLJiAZAd7AbthV" +
       "tjK1cABKd8VYjVhQlVsPp9xjJCM8qmbdmwEorGh2b12sZMB09ci2VgpQlUjJ" +
       "K9bY71fyRIoOzSKSIMN2sWsnOMvPxToJRDRSfe4EVv3Vv/3rzjXNE8xeMgFO" +
       "pg6CvG8Vg9r0l1WyIxUD2/a8vELimc+qcnTmAWm6427O4kwHvC6csdVuZ8tm" +
       "uY9XxWh4bnDQNGXF55p+MJmxqbuckK+AEaw9Fs7ZUuzo8zTkmogkYFGschXj" +
       "NhsuvKjuWoWbTkVz1mRMbgnCTjk1Gz8YTnu4uI4XtRLAvREQIryVQXrvg9C0" +
       "gXO+R6vNfocVG3M3Jvhh1FOMPse8hR7yNdFst8pmTuBL5ewhnUlwF4AD7eIk" +
       "aag0jbG52EyoyDSqrdyoICGOhHRzJTX8nsoZKwzPyCHvF29oK6sO4E7Wvr5E" +
       "9ZptYpkiVn1HTRtbNmIJPMJnzVIaMx8iJzV8hoJ3sBVTuwTYBMfRRldFu3jE" +
       "cm/sz9vc1DL7KM7Ikh5MQppCQ7F2mOmqA7EMIQVM9Ewcgiue5/irSBjotsjP" +
       "F1vMuPLg2Ou4rlyz5MwpWofG3Kqefcn9YVWlhW2WEJr5e+AU2ObiFDvqMkKq" +
       "Kgr5oA7nluQqMylufrG5GDp5QfnVTiMLYkWrWAqpZE1RsGR5msNw7GkS+lWH" +
       "bwrnJOAdPcmpiZt0R8Ro3A7Vvq+LaWzd/aVR6ON1dCE3FdScsAgRSygvuF6R" +
       "kUj8fQQOMYAbwbQz6L4B8wY5a2gqrIrl");
    public static final String jlc$ClassType$jl$1 =
      ("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" +
       "HkRbOtieiCsqDVdfyk10PeEwqLoUB7UMwNR757TRkyJhFB3CQxS+CEm3SiY7" +
       "NrpGTuptI2IUgMJr46DOR9+8hBUkBTDMnMSdC4c5uJzXPcvBOmh0s71jWVm2" +
       "gXgLXvmM2GRXN4bBdJWY1QiVJLiZljPBJsRAmLng8FFbS6UFMSC2NRH8WkPi" +
       "CGfnk+CjgQmriDf20mRyojJGgLyRCZDVVzuixnH8Kzc3+dMPTvVb3+NU314/" +
       "c6vTsxq4Lz6tgbv/u1UI32rSntyP+fRzNXDPVb/f3aqiv/P9ri7dV0T/wh/7" +
       "+s/7xz+/fu2hhP5H+rsP91X9Q3kwBvlzS310Wem7XlhJvL+u9awa/t8Xf+mv" +
       "M9/n/fRrdx94Wsj+nltf75705XeXr3+kDfqhLfV3FbF/+1Peb6V/9zx/5u7u" +
       "tfUD/O7nqwefhaMXxHZfOvjmw5S3HuDnXhTbs2sFH3hW8/fDTxv+fv0/94ob" +
       "CH/+1vx8f/fRofad/nFx5kuL7sYqeXzR7c+8m7tbTeTnFtJ+4wH+998cd7cp" +
       "v/4Af/VfirtffgV3/+Gt+cVFQx5z91Dj+e++jI/bLn3XguKPPMD8m+PjNiV7" +
       "gMG/FB//6Sv4+M9uzV98uktPi0JfysmtWvV7FzNjH+DnvzlOblO+4wF+5v05" +
       "eZ68/+oVff/1rfkvFs8RLsZ7r15SkESxWw2Py3jrl7Hw7cvzlYWc4QH63xwL" +
       "tyneA/zR92fh0cMVs9vvT/d3n1682eO6VblNSi+pH2pl/7tXcPfrt+av9Xcf" +
       "c/zHzN0KeV+2M/d1xDcPIC3vP/IAP/sKtl5SRHyb8pkH+PHf2878z6/o+9u3" +
       "5n9YEuWkuyedK4nn66NfcABvulWVB075su2ClsddXG78AH/km9uu25SvPED0" +
       "98bXP3xF33199f+yaNxTvsinJda3rr/7fiyMd3ff8rMP8Js0/9uU7AG+wvwf" +
       "NO7289fuV/3Hr+Djn9ya/72/+4yfdF5edcHjcmq9elpBz7/Aye0SxX1zW4R7" +
       "At/Dya156xWIf/sVff/01vxfi3Af16i//dzVzrefiekZSfe3Yr/viaiewP7O" +
       "f+/9xd//VjM4XdIMVR98/+NrgW/dos5btywjKccqC/ZB+Nwdzu//0ls/1sdJ" +
       "985LaPn+L335a196eiPyJVt3//fGi4Tdev9ZXb9CAP/PK/rub878Tn/3be9H" +
       "8fv67E+9V0I/940k9Phy2/MiSvqbSN76g8Ho5N//7BbGjzmF+7W3vvJWOeT5" +
       "l778g2/ddz+5C/HSzmd3Et7d/aPaWy+TKvJuqb75Eqk+evQqqT56/RV9b94+" +
       "/m5/96EnTN5LcVqi4XMbfrug+W3v+X8KHt+m9/7Cz3/iQ7/v542/fX979+mN" +
       "9zeEuw+FC1vP30Z87v2Nug3C5J7VNx7fTbzn+9FH+7s3Hivc7dfH6qe3Np7d" +
       "e3h8OXL6/wDo/tDHP0EAAA==");
}
