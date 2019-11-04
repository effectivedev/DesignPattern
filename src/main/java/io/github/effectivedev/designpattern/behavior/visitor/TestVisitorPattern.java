package io.github.effectivedev.designpattern.behavior.visitor;

public class TestVisitorPattern {
    private MacConfigurator macConfigurator;
    private LinuxConfigurator linuxConfigurator;
    private DLinkRouter dlink;
    private TPLinkRouter tplink;
    private LinkSysRouter linksys;

    private void setUp() {
        macConfigurator = new MacConfigurator();
        linuxConfigurator = new LinuxConfigurator();

        dlink = new DLinkRouter();
        tplink = new TPLinkRouter();
        linksys = new LinkSysRouter();
    }

    private void testDlink() {
        dlink.accept(macConfigurator);
        dlink.accept(linuxConfigurator);
    }
    private void testTPLink() {
        tplink.accept(macConfigurator);
        tplink.accept(linuxConfigurator);
    }

    private void testLinkSys() {
        linksys.accept(macConfigurator);
        linksys.accept(linuxConfigurator);
    }

    public static void main(String[] args) {
        TestVisitorPattern tp = new TestVisitorPattern();
        tp.setUp();
        tp.testDlink();
        tp.testTPLink();
        tp.testLinkSys();
    }
}
