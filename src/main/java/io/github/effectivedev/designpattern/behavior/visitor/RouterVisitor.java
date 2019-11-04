package io.github.effectivedev.designpattern.behavior.visitor;

public interface RouterVisitor {
    void visit(DLinkRouter router);
    void visit(TPLinkRouter router);
    void visit(LinkSysRouter router);
}
