import java.util.Scanner;

public class MovieAdvisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ze=(" 'мультфильм', 'сказка', 'приключение', 'фэнтези', 'комедия', 'семейный', 'мультсериал'");
        String si=(" 'мультфильм', 'приключение', 'фэнтези', 'комедия', 'семейный', 'фантастика', 'аниме'");
        String tw=(" 'приключение', 'драма', 'боевик', 'комедия', 'фэнтези', 'спорт', 'аниме'");
        String six=(" 'драма', 'триллер', 'криминал', 'фантастика', 'ужасы', 'спорт', 'комедия', 'фэнтези', 'романтика', 'боевик', 'приключение', 'мистика','аниме'");
        String ei=(" 'аниме', 'триллер', 'ужасы', 'боевик', 'мистика', 'детектив', 'криминал', 'комедия'");

        boolean ciclvprogramme = true;
        while (ciclvprogramme) {
            try {
                System.out.print("Введите возраст: ");
                int age = scanner.nextInt();

                System.out.print("Введите жанр: ");
                String genre = scanner.next();

                if (age <= 5) {
                    if (genre.equals("мультфильм")) {
                        System.out.println("Так как вам " + age + " год(а) и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nСнупи (Рейтинг 6.5)-> https://www.kinopoisk.ru/film/61441/\nКунг-Фу панда (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/103734/\nГринч (Рейтинг 7.6) -> https://www.kinopoisk.ru/film/738499/\nШрек (Рейтинг 8.2) -> https://www.kinopoisk.ru/film/430/\nЗверопой (Рейтинг 7.4) -> https://www.kinopoisk.ru/film/821008/\nТайная жизнь домашних животных (Рейтинг 6.9) -> https://www.kinopoisk.ru/film/743088/");
                    } else if (genre.equals("сказка")) {
                        System.out.println("Так как вам " + age + " год(а) и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nМорозко (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/46701/\nДвенадцать месяцев (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/63906/\nСнежная королева (Рейтинг 8.0) -> https://www.kinopoisk.ru/film/29818/\nЗолотой ключик (Рейтинг 7.2) -> https://www.kinopoisk.ru/film/45386/\nКащей бессметрный (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/44727/\nСказка о царе Салтане (Рейтинг 8.0) -> https://www.kinopoisk.ru/film/43814/");
                    } else if (genre.equals("приключение")) {
                        System.out.println("Так как вам " + age + " год(а) и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nПриключения Петрова и Васечкина (Рейтинг 7.9) -> https://www.kinopoisk.ru/film/81479/\nХроники Нарнии (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/48162/\nВолшебники страны Оз (Рейтинг 7.6) -> https://www.kinopoisk.ru/film/379/\nБольшой и добрый Великан (Рейтинг 6.1) -> https://www.kinopoisk.ru/film/840885/\nПриключения Тедди (Рейтинг 7.5) -> https://www.kinopoisk.ru/film/5003054/");
                    } else if (genre.equals("фэнтези")) {
                        System.out.println("Так как вам " + age + " год(а) и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nКаспер (Рейтинг 7.2) -> https://www.kinopoisk.ru/film/7098/\nДжуманджи (Рейтинг 7.9) -> https://www.kinopoisk.ru/film/8161/\nПо щучьему велению (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/4959134/\nБаба Яга спасает мир (Рейтинг 7.2) -> https://www.kinopoisk.ru/film/4536580/\nСказка о потерянном времени (Рейтинг 7.9) -> https://www.kinopoisk.ru/film/43811/");
                    } else if (genre.equals("комедия")) {
                        System.out.println("Так как вам " + age + " год(а) и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nБриллиантовая рука (Рейтинг 8.5) -> https://www.kinopoisk.ru/film/46225/\nНазад в будущее (Рейтинг 8.6) -> https://www.kinopoisk.ru/film/476/\nМистер Бин (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/8163/\nОдин дома (Рейтинг 8.3) -> https://www.kinopoisk.ru/film/8124/\nНочь в музее (Рейтинг 7.0) -> https://www.kinopoisk.ru/film/178580/");
                    } else if (genre.equals("семейный")) {
                        System.out.println("Так как вам " + age + " год(а) и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nБетховен (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/15635/\nСтюарт Литтл (Рейтинг 6.8) -> https://www.kinopoisk.ru/film/5327/\nМарли и я (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/279850/\nМы купили зоопарк (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/464413/\nЛовушка для родителей (Рейтинг 7.4) -> https://www.kinopoisk.ru/film/6522/");
                    } else if (genre.equals("мультсериал")) {
                        System.out.println("Так как вам " + age + " год(а) и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nМаша и Медведь (Рейтинг 7.3) -> https://www.kinopoisk.ru/series/478491/\nЛунтик (Рейтинг 4.9) -> https://www.kinopoisk.ru/series/405734/\nМалышарики (Рейтинг 9.0) -> https://www.kinopoisk.ru/series/988056/\nСмешарики (Рейтинг 7.8) -> https://www.kinopoisk.ru/series/256124/\nТри кота (Рейтинг 8.2) -> https://www.kinopoisk.ru/series/935898/");
                    } else {
                        System.out.println("Такого жанра нет. \nНо вы можете посмотреть такие жанры как" + ze);
                    }

                } else if (age <= 11) {
                    if (genre.equals("мультфильм")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nКороль Лев (Рейтинг 8.8) -> https://www.kinopoisk.ru/film/2360/\nБемби (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/8154/\nЛеди и бродяга (Рейтинг 8.2) -> https://www.kinopoisk.ru/film/8227/\nАлладин (Рейтинг 8.2) -> https://www.kinopoisk.ru/film/2361/\nСпирит: душа прерий (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/839/\nРусалочка (Рейтинг 8.2) -> https://www.kinopoisk.ru/film/8147/");
                    } else if (genre.equals("приключение")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nПутешествие к рождественской звезде (Рейтинг 6.3) -> https://www.kinopoisk.ru/film/619080/\nЛесси: возвращение домой (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/1272115/\nВолк и лев (Рейтинг 8.0) -> https://www.kinopoisk.ru/film/1304482/\nПриключение Паддингтона (Рейтинг 7.2) -> https://www.kinopoisk.ru/film/463897/\nПальма (Рейтинг 7.4) -> https://www.kinopoisk.ru/film/1142206/");
                    } else if (genre.equals("фэнтези")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nПиноккио (Рейтинг 6.7) -> https://www.kinopoisk.ru/film/1146252/\nМоя ужасная няня (Рейтинг 7.1) -> https://www.kinopoisk.ru/film/77427/\nСтражи времени (Рейтинг 5.7) -> https://www.kinopoisk.ru/film/4412061/\nРождественская история (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/391755/\nЧудо на 34 улице (Рейтинг 7.4) -> https://www.kinopoisk.ru/film/6851/");
                    } else if (genre.equals("комедия")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nМесть пушистых (Рейтинг 5.1) -> https://www.kinopoisk.ru/film/485351/\nМаленький Николя (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/424299/\nПеликан (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/589657/\nОдин на каникулах (Рейтинг 6.0) -> https://www.kinopoisk.ru/film/4890389/\nМаленькая мисс дулиттл (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/984826/");
                    } else if (genre.equals("семейный")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nГринч (Рейтинг 7.6) -> https://www.kinopoisk.ru/film/738499/\nЭлвин и бурундуки (Рейтинг 6.2) -> https://www.kinopoisk.ru/film/278361/\nЕлки (Рейтинг 6.9) -> https://www.kinopoisk.ru/film/493768/\n101 далматинец (Рейтинг 8.0) -> https://www.kinopoisk.ru/film/8129/\nМатильда (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/7643/\nДомовой (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/1111102/");
                    } else if (genre.equals("аниме")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nМой сосед Тоторо (Рейтинг 8.2) -> https://www.kinopoisk.ru/film/8221/\nВедьмина служба доставки (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/2428/\nПокемон (Рейтинг 6.7) -> https://www.kinopoisk.ru/series/79517/\nПриключения дигимонов (Рейтинг 6.9) -> https://www.kinopoisk.ru/series/229590/\nНебесный замок лапута (Рейтинг 8.3) -> https://www.kinopoisk.ru/film/1846/");
                    } else if (genre.equals("фантастика")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nПризрак (Рейтинг 7.1) -> https://www.kinopoisk.ru/film/839960/\nНазад к динозаврам (Рейтинг 6.6) -> https://www.kinopoisk.ru/film/1267204/\nГадкий я (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/432724/\nВратарь галактики (Рейтинг 4.9) -> https://www.kinopoisk.ru/film/841471/\nКалендарь ма(й)я (Рейтинг 7.4) -> https://www.kinopoisk.ru/film/4963617/");
                    } else {
                        System.out.println("Такого жанра нет. \nНо вы можете посмотреть такие жанры как" + si);
                    }

                } else if (age <= 15) {
                    if (genre.equals("приключение")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nЧарли и шоколадная фабрика (Рейтинг 7.6) -> https://www.kinopoisk.ru/film/38905/\nВластелин колец (Рейтинг 8.6) -> https://www.kinopoisk.ru/film/328/\nГарри Потер (Рейтинг 8.3) -> https://www.kinopoisk.ru/film/689/\nЗолотой компас (Рейтинг 6.6) -> https://www.kinopoisk.ru/film/91843/\nАлиса в стране чудес (Рейтинг 7.1) -> https://www.kinopoisk.ru/film/405609/\nПриключение Паддингтона (Рейтинг 7.2) -> https://www.kinopoisk.ru/film/463897/");
                    } else if (genre.equals("драма")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nМаленький принц (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/572553/\nА зори здесь тихие (Рейтинг 8.5) -> https://www.kinopoisk.ru/film/43395/\nМост в терабитию (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/78753/\nВам не снилось (Рейтинг 8.2) -> https://www.kinopoisk.ru/film/45660/\nДетство Чика (Рейтинг 7.1) -> https://www.kinopoisk.ru/film/4475367/");
                    } else if (genre.equals("боевик")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nШпион по соседству (Рейтинг 6.2) -> https://www.kinopoisk.ru/film/431539/\nБоевой конь (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/492174/\nАнчартед (Рейтинг 6.8) -> https://www.kinopoisk.ru/film/468373/\nДети шпионов (Рейтинг 6.6) -> https://www.kinopoisk.ru/film/841/\nПутешествие 2: Таинственный остров (Рейтинг 6.3) -> https://www.kinopoisk.ru/film/453367/");
                    } else if (genre.equals("комедия")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nЧебурашка (Рейтинг 8.2) -> https://www.kinopoisk.ru/film/45446/\nЛюбовь и голуби (Рейтинг 8.3) -> https://www.kinopoisk.ru/film/45146/\nСделано в Италии (Рейтинг 8.2) -> https://www.kinopoisk.ru/series/1209697/\nАртек. Большое путешествие (Рейтинг 7.5) -> https://www.kinopoisk.ru/film/1291197/\nГрозный папа (Рейтинг 7.1) -> https://www.kinopoisk.ru/film/1445164/");
                    } else if (genre.equals("фэнтези")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nМонстр-траки (Рейтинг 5.9) -> https://www.kinopoisk.ru/film/784331/\nКак приручить дракона (Рейтинг 8.2) -> https://www.kinopoisk.ru/film/280172/\nКонек-Горбунок (Рейтинг 7.2) -> https://www.kinopoisk.ru/film/1045583/\nПерси Джексон и похититель молний (Рейтинг 6.2) -> https://www.kinopoisk.ru/film/403986/\nТруп невесты (Рейтинг 7.9) -> https://www.kinopoisk.ru/film/77548/\nЧернильное сердце (Рейтинг 6.3) -> https://www.kinopoisk.ru/film/261097/");
                    } else if (genre.equals("спорт")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nЛед (Рейтинг 6.8) -> https://www.kinopoisk.ru/film/900052/\nЧемпионы (Рейтинг 6.9) -> https://www.kinopoisk.ru/film/4710684/\nДжерси (Рейтинг 7.1) -> https://www.kinopoisk.ru/film/1291348/\nДвижение вверх (Рейтинг 7.5) -> https://www.kinopoisk.ru/film/840817/\nМистер нокаут (Рейтинг 7.6) -> https://www.kinopoisk.ru/film/1234853/\nТриумф (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/909626/");
                    } else if (genre.equals("аниме")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nХодячий замок (Рейтинг 8.3) -> https://www.kinopoisk.ru/film/49684/\nПринцесса мононоке (Рейтинг 8.2) -> https://www.kinopoisk.ru/film/441/\nРыбка поньо на утесе (Рейтинг 8.0) -> https://www.kinopoisk.ru/film/261127/\nСад изящных слов (Рейтинг 7.9) -> https://www.kinopoisk.ru/film/730665/\nУнесенные призраками (Рейтинг 8.5) -> https://www.kinopoisk.ru/film/370/");
                    } else {
                        System.out.println("Такого жанра нет. \nНо вы можете посмотреть такие жанры как" + tw);
                    }

                } else if (age <= 17) {
                    if (genre.equals("драма")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nХранитель времени (Рейтинг 6.9) -> https://www.kinopoisk.ru/film/462247/\nСоциальная сеть (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/427198/\nХатико (Рейтинг 8.4) -> https://www.kinopoisk.ru/film/387556/\nПобег из Шаушенка (Рейтинг 9.1) -> https://www.kinopoisk.ru/film/326/\nДьявол носит Prada (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/104992/\nСемь жизней (Рейтинг 8.2) -> https://www.kinopoisk.ru/film/395787/");
                    } else if (genre.equals("триллер")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nТелекинез (Рейтинг 5.9) -> https://www.kinopoisk.ru/film/675631/\nВремя (Рейтинг 6.4) -> https://www.kinopoisk.ru/film/1379090/\nОстров фантазий (Рейтинг 5.8) -> https://www.kinopoisk.ru/film/462193/\nТайное окно (Рейтинг 7.2) -> https://www.kinopoisk.ru/film/4304/\nМилые обманщицы (Рейтинг 8.1) -> https://www.kinopoisk.ru/series/505748/");
                    } else if (genre.equals("криминал")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nПоследний наемник (Рейтинг 5.8) -> https://www.kinopoisk.ru/film/4696433/\nИллюзия обмана (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/522892/\nБрат (Рейтинг 8.3) -> https://www.kinopoisk.ru/film/41519/\nЛеон (Рейтинг 8.7) -> https://www.kinopoisk.ru/film/389/\nЗаконопослушный гражданин (Рейтинг 8.0) -> https://www.kinopoisk.ru/film/406408/");
                    } else if (genre.equals("фантастика")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nСтражи галактики (Рейтинг 7.9) -> https://www.kinopoisk.ru/film/689066/\nФантастические твари (Рейтинг 7.6) -> https://www.kinopoisk.ru/film/797840/\nМир юрского периода (Рейтинг 6.9) -> https://www.kinopoisk.ru/film/594554/\nБегущий в лабиринти (Рейтинг 6.8) -> https://www.kinopoisk.ru/film/575613/\nАватар (Рейтинг 8.0) -> https://www.kinopoisk.ru/film/251733/");
                    } else if (genre.equals("ужасы")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nОно (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/453397/\nОтмель (Рейтинг 6.3) -> https://www.kinopoisk.ru/film/928626/\nАталантида (Рейтинг 5.8) -> https://www.kinopoisk.ru/film/678639/\nИнкарнация (Рейтинг 5.4) -> https://www.kinopoisk.ru/film/800574/");
                    } else if (genre.equals("комедия")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\n1+1 (Рейтинг 8.8) -> https://www.kinopoisk.ru/film/535341/\nПоймай меня если сможешь (Рейтинг 8.5) -> https://www.kinopoisk.ru/film/324/\nМы-Миллеры (Рейтинг 7.2) -> https://www.kinopoisk.ru/film/582170/\nКруэлла (Рейтинг 7.6) -> https://www.kinopoisk.ru/film/804662/\nМаска (Рейтинг 8.0) -> https://www.kinopoisk.ru/film/6039/");
                    } else if (genre.equals("фэнтези")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nСпайдервик (Рейтинг 6.8) -> https://www.kinopoisk.ru/film/81926/\nДжек - покоритель великанов (Рейтинг 6.3) -> https://www.kinopoisk.ru/film/462453/\nКаролина в стране кошмаров (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/49166/\nБрюс всемогущий (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/39577/\nКонстантин: повелитель тьмы (Рейтинг 7.9) -> https://www.kinopoisk.ru/film/3793/");
                    } else if (genre.equals("романтика")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nЗаколдованная Элла (Рейтинг 6.8) -> https://www.kinopoisk.ru/film/1713/\nПринц из рая (Рейтинг 6.6) -> https://www.kinopoisk.ru/film/5082344/\nСтрашно красив (Рейтинг 6.2) -> https://www.kinopoisk.ru/film/450470/\nКрасавица и чудовище (Рейтинг 8.3) -> https://www.kinopoisk.ru/film/540/\nС любовью Рози (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/512784/");
                    } else if (genre.equals("приключение")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nГолодные игры (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/468581/\nЗвездная пыль (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/197863/\nХоббит: нежданное путешествие (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/278522/\nАквамен (Рейтинг 6.8) -> https://www.kinopoisk.ru/film/470178/\nШерлок Холмс (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/420923/");
                    } else if (genre.equals("мистика")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nЯга (Рейтинг 5.5) -> https://www.kinopoisk.ru/film/1124682/\nЗнакомьтесь Джо Блэк (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/5059/\nМашинист (Рейтинг 7.6) -> https://www.kinopoisk.ru/film/5206/\nЗагадочная история Бенджамина Баттона (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/81555/\nШестое чувство (Рейтинг 8.2) -> https://www.kinopoisk.ru/film/395/");
                    } else if (genre.equals("аниме")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nЧерный клевер (Рейтинг 8.1) -> https://www.kinopoisk.ru/series/1049731/\nСемь смертных грехов (Рейтинг 7.6) -> https://www.kinopoisk.ru/series/843954/\nНаруто (Рейтинг 8.3) -> https://www.kinopoisk.ru/series/281884/\nВан-Пис (Рейтинг 8.4) -> https://www.kinopoisk.ru/series/382731/\nБлич (Рейтинг 8.0) -> https://www.kinopoisk.ru/series/258621/");
                    } else if (genre.equals("боевик")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nДевергент (Рейтинг 6.7) -> https://www.kinopoisk.ru/film/582101/\nПираты карибского моря (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/63991/\nЧерный рыдцарь (Рейтинг 6.5) -> https://www.kinopoisk.ru/film/8110/\nФорсаж 7 (Рейтинг 7.0) -> https://www.kinopoisk.ru/film/754481/\nПаркер (Рейтинг 6.7) -> https://www.kinopoisk.ru/film/586475/");
                    } else if (genre.equals("спорт")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nВыкрутасы (Рейтинг 6.3) -> https://www.kinopoisk.ru/film/471158/\nГонка (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/596125/\nРегби (Рейтинг 8.2) -> https://www.kinopoisk.ru/series/1338269/\n42 (Рейтинг 7.5) -> https://www.kinopoisk.ru/film/102260/");
                    } else {
                        System.out.println("Такого жанра нет. \nНо вы можете посмотреть такие жанры как" + six);
                    }
                } else {
                    if (genre.equals("аниме")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nПоднятие уровня в одиночку (Рейтинг 8.3) -> https://www.kinopoisk.ru/series/5230828/\nАтака Титанов (Рейтинг 8.7) -> https://www.kinopoisk.ru/series/749374/\nТокийский Гуль (Рейтинг 7.1) -> https://www.kinopoisk.ru/series/841681/\nМагическая битва (Рейтинг 8.1) -> https://www.kinopoisk.ru/series/1381125/\nКлинок, рассеккающий демонов (Рейтинг 8.2) -> https://www.kinopoisk.ru/series/1220920/");
                    } else if (genre.equals("триллер")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nСплит (Рейтинг 7.0) -> https://www.kinopoisk.ru/film/930534/\nПерсона (Рейтинг 8.0) -> https://www.kinopoisk.ru/film/79506/\nЯ иду искать (Рейтинг 6.9) -> https://www.kinopoisk.ru/film/1198736/\nСияние (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/409/\nАферистка (Рейтинг 6.7) -> https://www.kinopoisk.ru/film/1248786/");
                    } else if (genre.equals("ужасы")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nАстрал (Рейтинг 6.8) -> https://www.kinopoisk.ru/film/495892/\nОбитель зла (Рейтинг 7.6) -> https://www.kinopoisk.ru/film/801/\nИ гаснет свет (Рейтинг 5.9) -> https://www.kinopoisk.ru/film/919515/\nНе стучи дважды (Рейтинг 4.9) -> https://www.kinopoisk.ru/film/910183/\nМаршрут построен (Рейтинг 4.0) -> https://www.kinopoisk.ru/film/933852/");
                    } else if (genre.equals("боевик")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nГангстер поп и дьявол (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/1177510/\nДжон Уик (Рейтинг 7.0) -> https://www.kinopoisk.ru/film/762738/\nВне/себя (Рейтинг 6.9) -> https://www.kinopoisk.ru/film/655435/\nПереводчик (Рейтинг 7.9) -> https://www.kinopoisk.ru/film/927898/\nДэдпул (Рейтинг 7.6) -> https://www.kinopoisk.ru/film/462360/");
                    } else if (genre.equals("мистика")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nГоголь (Рейтинг 6.8) -> https://www.kinopoisk.ru/series/1232164/\nТихое место (Рейтинг 6.8) -> https://www.kinopoisk.ru/film/1044906/\nКод да винчи (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/77711/\nОбитель теней (Рейтинг 7.1) -> https://www.kinopoisk.ru/film/992500/\nДитя тьмы (Рейтинг 6.9) -> https://www.kinopoisk.ru/film/400615/");
                    } else if (genre.equals("детектив")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nОстров проклятых (Рейтинг 8.5) -> https://www.kinopoisk.ru/film/397667/\nВоспоминания об убийстве (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/65770/\nЗодиак (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/102838/\nТело (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/609349/\nДевушка с татуировкой драконо (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/491724/");
                    } else if (genre.equals("криминал")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nПодмена (Рейтинг 7.9) -> https://www.kinopoisk.ru/film/279880/\nДжентльмены (Рейтинг 8.6) -> https://www.kinopoisk.ru/film/1143242/\nЗеленая миля (Рейтинг 9.1) -> https://www.kinopoisk.ru/film/435/\nБрат (Рейтинг 8.3) -> https://www.kinopoisk.ru/film/41519/\nДжокер (Рейтинг 8.0) -> https://www.kinopoisk.ru/film/1048334/\nВолк с Уолл-Стрит (Рейтинг 8.0) -> https://www.kinopoisk.ru/film/462682/");
                    } else if (genre.equals("комедия")) {
                        System.out.println("Так как вам " + age + " лет и вы предпочитаете жанр " + genre + ", рекомендуем вам фильмы:\nТретий лишний (Рейтинг 6.7) -> https://www.kinopoisk.ru/film/507817/\nШпион (Рейтинг 7.9) -> https://www.kinopoisk.ru/series/4476421/\nБатя (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/1326397/\nЛулу и бриггс (Рейтинг 7.4) -> https://www.kinopoisk.ru/film/1355139/\nМальчишник в Вегасе (Рейтинг 7.9) -> https://www.kinopoisk.ru/film/426004/");
                    } else {
                        System.out.println("Такого жанра нет. \nНо вы можете посмотреть такие жанры как" + ei);
                    }
                }
                System.out.print("Нажмите 1, если хотите посмотреть еще фильмы, или нажмите 0, чтобы выйти из программы: ");
                int choice = scanner.nextInt();
                ciclvprogramme = (choice == 1);

            }catch (java.util.InputMismatchException ex){
                System.out.println("Вы ввели неправильное число");
                scanner.nextLine();
            }
        }
        System.out.println("До свидания! Приятного просмотра!");
    }
}