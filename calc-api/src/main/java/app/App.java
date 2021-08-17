package app;

import io.jooby.Jooby;

public class App extends Jooby {

  {
    //Declara as rotas
    mvc(new Controller());
    mvc(new Soma());
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
