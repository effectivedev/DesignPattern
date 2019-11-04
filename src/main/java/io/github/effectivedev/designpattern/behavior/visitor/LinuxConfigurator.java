package io.github.effectivedev.designpattern.behavior.visitor;

public class LinuxConfigurator implements RouterVisitor {
    @Override
    public void visit(DLinkRouter router) {
        System.out.println("DLinkRouter configuration for Linux complete !!");
    }

    @Override
    public void visit(TPLinkRouter router) {
        System.out.println("TPLinkRouter configuration for Linux complete !!");
    }

    @Override
    public void visit(LinkSysRouter router) {
        System.out.println("LinkSysRouter configuration for Linux complete !!");
    }
}
