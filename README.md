# Evgenii Borisov - Spring Terminator

* [Part 1](https://www.youtube.com/watch?v=BmBr5diz8WA)

* [Part 2](https://www.youtube.com/watch?v=cou_qomYLNU&t=9s)

   В первой части Евгений рассказывает как создать трёхфазовый конструктор, как создать свою аннотацию и как добавить
профилирование.
* за первый конструктор отвечает Java
* за второй конструктор (@PostConstruct) отвечает BeanPostProcessor
* за третий конструктор (@AfterProxy) отвечает ContextListener

   Во второй части рассказывается о работе BeanFactoryPostProcessor.
* BeanFactoryPostProcessor позволяет настраивать бин дифиншны до того как создаются бины.
* Этот интерфейс имеет один метод: postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)