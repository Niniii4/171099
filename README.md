# Проект по ВЕБ ПРОГРАМИРАЊЕ, зимски семестар 2019/2020

Проектот Shift a Gift е креиран со 2 главни технологии за Веб Програмирање: Spring Boot & ReactJs. Користена е напредна база на податоци со отворен код: PostgreSQL. 
Главна цел на креираната „апликација“ (проект) се гледа и во самото име - испраќање поклон. 


## Претставување на проектот со приказна

> „Одредена компанија (цвеќара, Gift Shop) нуди несекојдневни услуги за своите клиенти: клиентот онлајн (преку интернет) да си го порача соодветниот поклон кој му е потребен за одредена пригода. Бидејќи е новоотворена компанијата на 2 места во светот, со инвоативни начини на работа, решаваат да и дадат и несекојдневно име на својата цвеќара - Shift a Gift. На онлајн страната можат клиентите да си креираат поклон по нивен избор, со име, бои, детали и величини. Доколку клиентот е неодлучен, или му се допаднал некој од веќе достапните поклони кои ги нуди компанијата, може да одбере од нив и да ги порача. Ако сака да промени одредени детали поврзани со веќе готовиот поклон, достапна е и таа опција. Потоа, потребно е само да внесе неколку информации за соодветно и навремено доставување на неговиот поклон. Ако клиентот не сака друг да има ист поклон како неговиот, може истиот да го отстрани од понудените поклони.“


## Spring Boot

Креирани се **5 класни ентитети** кои имаат различна поврзаност меѓусебно. Најглавна од нив е класата **"Gifts" (Поклони)** од која наследуваат други 3 класи: **"Flowers" (Цвеќиња)**, **"Wrappings" (Обвивки)** и **"Ornaments" (Украси)**. Останатите се **"Details" (Детали)** и **"Orders" (Нарачки)**. 
Секое цвеќе може да има повеќе детали, и повеќе детали можат да бидат на различни цвеќиња. Истото важи и за обвивките. Еден од поклоните (цвеќиња, обвивки и украси) може да биде нарачан повеќе пати. 

За управување со секоја од класините ентитети има креирано соодветни JpaRepositories. Бизнис логиката е во сите сервиси, а за нив има креирано соодветни интерфејси кои ги содржат методите што сервисот ги имплементира. На крај, RestControllers, кои се комбинација на анотации од контролери и тела на одговори, се користат за директно претворање на соодветните HTTP одговори. 

*За да пристапите до овој дел од проектот треба во вашата соодветна околина со која работите да ја отворите папката shift-gift. Конфигурациите на апликацијата се достапни.*

*За да ви работи апликацијата (FrontEnd + DataBase + BackEnd) кликнете **Run** или **Debug** на **shift-gift** фолдерот. За секој случај, рефреширајте ја поврзаната база на податоци. Таму ќе се појават табелите во шемата **shift** која се наоѓа во postgres откако вашата апликација ќе биде извршена.*


## ReactJs

*За да го гледате корисничниот интерфејс на апликацијата, треба да се наоѓате во папката **shift-a-gift** во **Command Prompt**. Извршете **`npm start`** и почекајте некое време. Апликацијата ќе ви се отвори во одреден прелистувач со пат (http://localhost:3000/). Се препорачува пооддалечен преглед во прелистувачот (75%) за координиран изглед на компонентите.*

Проектот е прикачен **без** предефинирани вредности за секоја од променливите т.ш. доколку е потребно тестирање на функционалноста на секоја од компонентите, креирајте некој поклон. Поклон се креира со влез во една од 3те наследнички класни ентитети.

Секој од класните ентитети има соодветна папка во делот **Pages**. Освен тоа, има неколку додадени дополнителни фолдери и фајлови кои се круцијални за хармоничен и координиран распоред на елементите при кориснички интерфејси. 


## Изработено од

##### Студент: Хаџи-Котарова Нина
##### Индекс: 171099
##### Студиска програма: Компјутерски науки и инженерство
##### Професор во i-know: проф. д-р. Димитар Трајанов
