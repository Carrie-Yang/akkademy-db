package com.akkademy;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.testkit.TestActorRef;
import com.akkademy.messages.SetRequest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by yanglu on 2016/12/28.
 */
public class AkkademyDbTest {

    ActorSystem system = ActorSystem.create();

    @Test
    public void itShouldPlaceKeyValueFromSetMessageIntoMap() {
        TestActorRef<AkkademyDb> actorRef = TestActorRef.create(system, Props.create(AkkademyDb.class));
        actorRef.tell(new SetRequest("key", "value"), ActorRef.noSender());
        AkkademyDb akkademyDb = actorRef.underlyingActor();
        assertEquals(akkademyDb.map.get("key"), "value");
    }

//    @Test public void printToConsole() throws Exception {
//        askPong("Ping").
//                thenAccept(x -> System.out.println("replied with: " + x));
//        Thread.sleep(100);

//CompletionStage<String> cs = askPong("Ping").thenCompose(x ->
//        askPong("Ping"));
    //        Thread.sleep(100);

//askPong("cause error").handle((x, t) -> {
//        if(t!=null){
//            System.out.println("Error: " + t);
//        }
//        return null;
//    });
//    }
    //        Thread.sleep(100);

//    CompletionStage<String> cs = askPong("cause error").
//            exceptionally(t -> {
//                return "default";
//            });
    //        Thread.sleep(100);

//    askPong("cause error")
//    .handle( (pong, ex) -> ex == null
//            ? CompletableFuture.completedFuture(pong)
//            : askPong("Ping")
//    ).thenCompose(x -> x);
    //        Thread.sleep(100);

//    askPong("Ping").
//    thenCompose(x -> askPong("Ping" + x)).
//    handle((x, t) -> {
//        if(t != null){
//            return "default";
//        }else{
//            return x;
//        } });
    //        Thread.sleep(100);

//askPong("Ping").
//    thenCombine(askPong("Ping"), (a,b) -> {
//        return a + b; //"PongPong"
//    });
    //        Thread.sleep(100);
}
