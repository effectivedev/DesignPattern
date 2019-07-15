package io.github.effectivedev.designpattern.mediator;

public class MediatorMain {
    public static void main(String[] args) {
        IMediator mediator = new ConcreteMediator();

        Colleague talkColleague = new ColleagueA((mediator));
        Colleague fightColleague = new ColleagueB((mediator));

        talkColleague.doSomething();
        fightColleague.doSomething();
    }
}
