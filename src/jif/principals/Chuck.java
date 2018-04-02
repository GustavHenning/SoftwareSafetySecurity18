package jif.principals;

public class Chuck extends jif.lang.ExternalPrincipal {
    public Chuck jif$principals$Chuck$() {
        this.jif$init();
        { this.jif$lang$ExternalPrincipal$("Chuck"); }
        return this;
    }
    
    private static Chuck P;
    
    public static jif.lang.Principal getInstance() {
        if (Chuck.P == null) { Chuck.P = new Chuck().jif$principals$Chuck$(); }
        return Chuck.P;
    }
    
    public static final String jlc$CompilerVersion$jif = "3.5.0";
    public static final long jlc$SourceLastModified$jif = 1466709820000L;
    public static final String jlc$ClassType$jif =
      ("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" +
       "1rLGdCMZAAA=");
    
    public Chuck() { super(); }
    
    public void jif$invokeDefConstructor() { this.jif$principals$Chuck$(); }
    
    private void jif$init() {  }
    
    public static final String jlc$CompilerVersion$jl = "2.7.1";
    public static final long jlc$SourceLastModified$jl = 1466709820000L;
    public static final String jlc$ClassType$jl =
      ("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" + "AAA=");
}
