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

   Так же во второй части рассказывается о работе ClassPathBeanDefinitionScanner (далее "крот")
* Не является ни BeanFactoryPostProcessor ни BeanPostProcessor
* Он ResourceLoaderAware (подгружает дополнительные ресурсы)
* Создаёт BeanDefinition из всех классов над которыми стоит @Component или другая аннотация, аннотированная @Component

   Кто обрабатывает JavaConfig?
* ConfigurationClassPostProcessor (особый BeanFactoryPostProcessor)
* Его регистрирует AnnotationConfigApplicationContext
* Он создаёт бин-дифинишны по @Bean
* А так же относится к: @Import, @ImportResource, @ComponentScan (да, да там опять будет задействован крот)