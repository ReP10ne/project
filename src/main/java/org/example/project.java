package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class project extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "Arnola";
    }

    @Override
    public String getBotToken() {
        return "6989874400:AAEHHMDMF_wIJEmQL2kzhcxwIwWIHg8tO0k";
    }
    public void sendMsg(Message message, String text) {
        SendMessage sendMessage = new SendMessage();            //создали объект класса, то бишь проинициализировали отправленное сообщение
        sendMessage.enableMarkdown(true);                            //включили возможность разметки
        sendMessage.setChatId(message.getChatId().toString());      //определяем ID чата, чтобы знать на какой конкретно чат нужно отправить ответ
        sendMessage.setReplyToMessageId(message.getMessageId());    //определяем ID сообщения, чтобы знать на какое ответить
        sendMessage.setText(text);                                  //установить сообщению текст, который отправили в метод
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpdateReceived(Update update) {
            Message message = update.getMessage();                  //создали объект класса, то бишь проинициализировали сообщение
        String start = "Приветствуем вас в нашем уютном боте по советам к просмотру фильмов " +
                "\nВ нашем боте вы можете найти фильмы для разной возрастной категории";
        String menu = "Список команд\n" +
                "/start Приветсвие бота\n" +
                "/age Возрастные категории фильмов\n" +
                "/genre Жанры фильмов по возрастным категориям\n" +
                "/film {возрастная категория} {жанр} Список фильмов которые я рекомендую\n" +
                "Например: " +
                "\n/film 0 сказка" +
                "\nВыдает фильмы с жанром сказка возрастным рейтингом 0+";
        String other = "Прошу прощения но я не понимаю что вы хотите сделать, введите /menu чтобы увидеть все команды которые мы можем сделать";
        String age = "Возрастные категории:\n0, 8, 12, 16, 18";
        String genre = "Жанры 0+:\nмультфильм, сказка, приключение, фэнтези, комедия, семейный, мультсериал" +
                "\n\nЖанры 6+:\nмультфильм, приключение, фэнтези, комедия, семейный, фантастика, аниме" +
                "\n\nЖанры 12+:\nприключение, драма, боевик, комедия, фэнтези, спорт, аниме" +
                "\n\nЖанры 16+:\nдрама, триллер, криминал, фантастика, ужасы, спорт, комедия, фэнтези, романтика, боевик, приключение, мистика, аниме"+
                "\n\nЖанры 18+:\nаниме, триллер, ужасы, боевик, мистика, детектив, криминал, комедия";
        String ze= "Жанры 0+:\nмультфильм, сказка, приключение, фэнтези, комедия, семейный, мультсериал";
        String si= "Жанры 6+:\nмультфильм, приключение, фэнтези, комедия, семейный, фантастика, аниме";
        String tw= "Жанры 12+:\nприключение, драма, боевик, комедия, фэнтези, спорт, аниме";
        String six= "Жанры 16+:\nдрама, триллер, криминал, фантастика, ужасы, спорт, комедия, фэнтези, романтика, боевик, приключение, мистика, аниме";
        String ei= "Жанры 18+:\nаниме, триллер, ужасы, боевик, мистика, детектив, криминал, комедия";
        String film0cartoons = "Вы выбрали мультфильмы с возрастным ограничением 0+\nи я рекомендую вам:" +
                "\nСнупи (Рейтинг 6.5)-> https://www.kinopoisk.ru/film/61441/" +
                "\nКунг-Фу панда (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/103734/" +
                "\nГринч (Рейтинг 7.6) -> https://www.kinopoisk.ru/film/738499/" +
                "\nШрек (Рейтинг 8.2) -> https://www.kinopoisk.ru/film/430/" +
                "\nЗверопой (Рейтинг 7.4) -> https://www.kinopoisk.ru/film/821008/" +
                "\nТайная жизнь домашних животных (Рейтинг 6.9) -> https://www.kinopoisk.ru/film/743088/\"";
        String film0tale ="Вы выбрали фильмы с жанром сказки с возрастным ограничением 0+\nи я рекомендую вам:" +
                "\nМорозко (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/46701/" +
                "\nДвенадцать месяцев (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/63906/" +
                "\nСнежная королева (Рейтинг 8.0) -> https://www.kinopoisk.ru/film/29818/" +
                "\nЗолотой ключик (Рейтинг 7.2) -> https://www.kinopoisk.ru/film/45386/" +
                "\nКащей бессметрный (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/44727/" +
                "\nСказка о царе Салтане (Рейтинг 8.0) -> https://www.kinopoisk.ru/film/43814/";
        String film0adventure ="Вы выбрали фильмы с жанром приключение с возрастным ограничением 0+\nи я рекомендую вам:" +
                "\nПриключения Петрова и Васечкина (Рейтинг 7.9) -> https://www.kinopoisk.ru/film/81479/" +
                "\nХроники Нарнии (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/48162/" +
                "\nВолшебники страны Оз (Рейтинг 7.6) -> https://www.kinopoisk.ru/film/379/" +
                "\nБольшой и добрый Великан (Рейтинг 6.1) -> https://www.kinopoisk.ru/film/840885/" +
                "\nПриключения Тедди (Рейтинг 7.5) -> https://www.kinopoisk.ru/film/5003054/";
        String film0fantasy ="Вы выбрали фильмы с жанром приключения с возрастным ограничением 0+\nи я рекомендую вам:" +
                "\nКаспер (Рейтинг 7.2) -> https://www.kinopoisk.ru/film/7098/" +
                "\nДжуманджи (Рейтинг 7.9) -> https://www.kinopoisk.ru/film/8161/" +
                "\nПо щучьему велению (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/4959134/" +
                "\nБаба Яга спасает мир (Рейтинг 7.2) -> https://www.kinopoisk.ru/film/4536580/" +
                "\nСказка о потерянном времени (Рейтинг 7.9) -> https://www.kinopoisk.ru/film/43811/";
        String film0comedy ="Вы выбрали фильмы с жанром комедия с возрастным ограничением 0+\nи я рекомендую вам:" +
                "\nБриллиантовая рука (Рейтинг 8.5) -> https://www.kinopoisk.ru/film/46225/" +
                "\nНазад в будущее (Рейтинг 8.6) -> https://www.kinopoisk.ru/film/476/" +
                "\nМистер Бин (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/8163/" +
                "\nОдин дома (Рейтинг 8.3) -> https://www.kinopoisk.ru/film/8124/" +
                "\nНочь в музее (Рейтинг 7.0) -> https://www.kinopoisk.ru/film/178580/";
        String film0family ="Вы выбрали фильмы с жанром семья с возрастным ограничением 0+\nи я рекомендую вам:" +
                "\nБетховен (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/15635/" +
                "\nСтюарт Литтл (Рейтинг 6.8) -> https://www.kinopoisk.ru/film/5327/" +
                "\nМарли и я (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/279850/" +
                "\nМы купили зоопарк (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/464413/" +
                "\nЛовушка для родителей (Рейтинг 7.4) -> https://www.kinopoisk.ru/film/6522/";
        String film0series ="Вы выбрали мультсериалы с возрастным ограничением 0+\nи я рекомендую вам:" +
                "\nМаша и Медведь (Рейтинг 7.3) -> https://www.kinopoisk.ru/series/478491/" +
                "\nЛунтик (Рейтинг 4.9) -> https://www.kinopoisk.ru/series/405734/" +
                "\nМалышарики (Рейтинг 9.0) -> https://www.kinopoisk.ru/series/988056/" +
                "\nСмешарики (Рейтинг 7.8) -> https://www.kinopoisk.ru/series/256124/" +
                "\nТри кота (Рейтинг 8.2) -> https://www.kinopoisk.ru/series/935898/";
        String film6cartoons = "Вы выбрали мультфильмы с возрастным ограничением 6+\nи я рекомендую вам:" +
                "\nКороль Лев (Рейтинг 8.8) -> https://www.kinopoisk.ru/film/2360/\n" +
                "Бемби (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/8154/\n" +
                "Леди и бродяга (Рейтинг 8.2) -> https://www.kinopoisk.ru/film/8227/" +
                "\nАлладин (Рейтинг 8.2) -> https://www.kinopoisk.ru/film/2361/" +
                "\nСпирит: душа прерий (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/839/" +
                "\nРусалочка (Рейтинг 8.2) -> https://www.kinopoisk.ru/film/8147/";
        String film6adventure = "Вы выбрали фильмы с жанром приключения с возрастным ограничением 6+\nи я рекомендую вам:" +
                "\nПутешествие к рождественской звезде (Рейтинг 6.3) -> https://www.kinopoisk.ru/film/619080/" +
                "\nЛесси: возвращение домой (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/1272115/" +
                "\nВолк и лев (Рейтинг 8.0) -> https://www.kinopoisk.ru/film/1304482/" +
                "\nПриключение Паддингтона (Рейтинг 7.2) -> https://www.kinopoisk.ru/film/463897/" +
                "\nПальма (Рейтинг 7.4) -> https://www.kinopoisk.ru/film/1142206/";
        String film6fantasy = "Вы выбрали фильмы с жанром фэнтеси с возрастным ограничением 6+\nи я рекомендую вам:" +
                "\nПиноккио (Рейтинг 6.7) -> https://www.kinopoisk.ru/film/1146252/" +
                "\nМоя ужасная няня (Рейтинг 7.1) -> https://www.kinopoisk.ru/film/77427/" +
                "\nСтражи времени (Рейтинг 5.7) -> https://www.kinopoisk.ru/film/4412061/" +
                "\nРождественская история (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/391755/" +
                "\nЧудо на 34 улице (Рейтинг 7.4) -> https://www.kinopoisk.ru/film/6851/";
        String film6comedy = "Вы выбрали фильмы с жанром комедия с возрастным ограничением 6+\nи я рекомендую вам:" +
                "\nМесть пушистых (Рейтинг 5.1) -> https://www.kinopoisk.ru/film/485351/" +
                "\nМаленький Николя (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/424299/" +
                "\nПеликан (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/589657/" +
                "\nОдин на каникулах (Рейтинг 6.0) -> https://www.kinopoisk.ru/film/4890389/" +
                "\nМаленькая мисс дулиттл (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/984826/";
        String film6family = "Вы выбрали фильмы с жанром семейный с возрастным ограничением 6+\nи я рекомендую вам:" +
                "\nГринч (Рейтинг 7.6) -> https://www.kinopoisk.ru/film/738499/" +
                "\nЭлвин и бурундуки (Рейтинг 6.2) -> https://www.kinopoisk.ru/film/278361/" +
                "\nЕлки (Рейтинг 6.9) -> https://www.kinopoisk.ru/film/493768/" +
                "\n101 далматинец (Рейтинг 8.0) -> https://www.kinopoisk.ru/film/8129/" +
                "\nМатильда (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/7643/" +
                "\nДомовой (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/1111102/";
        String film6fantastic = "Вы выбрали фильмы с жанром фантастика с возрастным ограничением 6+\nи я рекомендую вам:" +
                "\nПризрак (Рейтинг 7.1) -> https://www.kinopoisk.ru/film/839960/" +
                "\nНазад к динозаврам (Рейтинг 6.6) -> https://www.kinopoisk.ru/film/1267204/" +
                "\nГадкий я (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/432724/" +
                "\nВратарь галактики (Рейтинг 4.9) -> https://www.kinopoisk.ru/film/841471/" +
                "\nКалендарь ма(й)я (Рейтинг 7.4) -> https://www.kinopoisk.ru/film/4963617/";
        String film6anime = "Вы выбрали аниме с возрастным ограничением 6+\nи я рекомендую вам:" +
                "\nМой сосед Тоторо (Рейтинг 8.2) -> https://www.kinopoisk.ru/film/8221/" +
                "\nВедьмина служба доставки (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/2428/" +
                "\nПокемон (Рейтинг 6.7) -> https://www.kinopoisk.ru/series/79517/" +
                "\nПриключения дигимонов (Рейтинг 6.9) -> https://www.kinopoisk.ru/series/229590/" +
                "\nНебесный замок лапута (Рейтинг 8.3) -> https://www.kinopoisk.ru/film/1846/";
        String film12adventure = "Вы выбрали фильмы с жанром приключение с возрастным ограничением 12+\nи я рекомендую вам:" +
                "\nЧарли и шоколадная фабрика (Рейтинг 7.6) -> https://www.kinopoisk.ru/film/38905/" +
                "\nВластелин колец (Рейтинг 8.6) -> https://www.kinopoisk.ru/film/328/" +
                "\nГарри Потер (Рейтинг 8.3) -> https://www.kinopoisk.ru/film/689/" +
                "\nЗолотой компас (Рейтинг 6.6) -> https://www.kinopoisk.ru/film/91843/" +
                "\nАлиса в стране чудес (Рейтинг 7.1) -> https://www.kinopoisk.ru/film/405609/" +
                "\nПриключение Паддингтона (Рейтинг 7.2) -> https://www.kinopoisk.ru/film/463897/";
        String film12drama = "Вы выбрали фильмы с жанром драма с возрастным ограничением 12+\nи я рекомендую вам:" +
                "\nМаленький принц (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/572553/" +
                "\nА зори здесь тихие (Рейтинг 8.5) -> https://www.kinopoisk.ru/film/43395/" +
                "\nМост в терабитию (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/78753/" +
                "\nВам не снилось (Рейтинг 8.2) -> https://www.kinopoisk.ru/film/45660/" +
                "\nДетство Чика (Рейтинг 7.1) -> https://www.kinopoisk.ru/film/4475367/";
        String film12action = "Вы выбрали фильмы с жанром боевик с возрастным ограничением 12+\nи я рекомендую вам:" +
                "\nШпион по соседству (Рейтинг 6.2) -> https://www.kinopoisk.ru/film/431539/" +
                "\nБоевой конь (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/492174/" +
                "\nАнчартед (Рейтинг 6.8) -> https://www.kinopoisk.ru/film/468373/" +
                "\nДети шпионов (Рейтинг 6.6) -> https://www.kinopoisk.ru/film/841/" +
                "\nПутешествие 2: Таинственный остров (Рейтинг 6.3) -> https://www.kinopoisk.ru/film/453367/";
        String film12comedy = "Вы выбрали фильмы с жанром комедия с возрастным ограничением 12+\nи я рекомендую вам:" +
                "\nЧебурашка (Рейтинг 8.2) -> https://www.kinopoisk.ru/film/45446/" +
                "\nЛюбовь и голуби (Рейтинг 8.3) -> https://www.kinopoisk.ru/film/45146/" +
                "\nСделано в Италии (Рейтинг 8.2) -> https://www.kinopoisk.ru/series/1209697/" +
                "\nАртек. Большое путешествие (Рейтинг 7.5) -> https://www.kinopoisk.ru/film/1291197/" +
                "\nГрозный папа (Рейтинг 7.1) -> https://www.kinopoisk.ru/film/1445164/";
        String film12fantasy = "Вы выбрали фильмы с жанром фэнтези с возрастным ограничением 12+\nи я рекомендую вам:" +
                "\nМонстр-траки (Рейтинг 5.9) -> https://www.kinopoisk.ru/film/784331/" +
                "\nКак приручить дракона (Рейтинг 8.2) -> https://www.kinopoisk.ru/film/280172/" +
                "\nКонек-Горбунок (Рейтинг 7.2) -> https://www.kinopoisk.ru/film/1045583/" +
                "\nПерси Джексон и похититель молний (Рейтинг 6.2) -> https://www.kinopoisk.ru/film/403986/" +
                "\nТруп невесты (Рейтинг 7.9) -> https://www.kinopoisk.ru/film/77548/" +
                "\nЧернильное сердце (Рейтинг 6.3) -> https://www.kinopoisk.ru/film/261097/";
        String film12sport = "Вы выбрали фильмы с жанром спорт с возрастным ограничением 12+\nи я рекомендую вам:" +
                "\nЛед (Рейтинг 6.8) -> https://www.kinopoisk.ru/film/900052/" +
                "\nЧемпионы (Рейтинг 6.9) -> https://www.kinopoisk.ru/film/4710684/" +
                "\nДжерси (Рейтинг 7.1) -> https://www.kinopoisk.ru/film/1291348/" +
                "\nДвижение вверх (Рейтинг 7.5) -> https://www.kinopoisk.ru/film/840817/" +
                "\nМистер нокаут (Рейтинг 7.6) -> https://www.kinopoisk.ru/film/1234853/" +
                "\nТриумф (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/909626/";
        String film12anime = "Вы выбрали фильмы с жанром аниме с возрастным ограничением 12+\nи я рекомендую вам:" +
                "\nХодячий замок (Рейтинг 8.3) -> https://www.kinopoisk.ru/film/49684/" +
                "\nПринцесса мононоке (Рейтинг 8.2) -> https://www.kinopoisk.ru/film/441/" +
                "\nРыбка поньо на утесе (Рейтинг 8.0) -> https://www.kinopoisk.ru/film/261127/" +
                "\nСад изящных слов (Рейтинг 7.9) -> https://www.kinopoisk.ru/film/730665/" +
                "\nУнесенные призраками (Рейтинг 8.5) -> https://www.kinopoisk.ru/film/370/";
        String film16drama = "Вы выбрали фильмы с жанром драма с возрастным ограничением 16+\nи я рекомендую вам:" +
                "\nХранитель времени (Рейтинг 6.9) -> https://www.kinopoisk.ru/film/462247/" +
                "\nСоциальная сеть (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/427198/" +
                "\nХатико (Рейтинг 8.4) -> https://www.kinopoisk.ru/film/387556/" +
                "\nПобег из Шаушенка (Рейтинг 9.1) -> https://www.kinopoisk.ru/film/326/" +
                "\nДьявол носит Prada (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/104992/" +
                "\nСемь жизней (Рейтинг 8.2) -> https://www.kinopoisk.ru/film/395787/";
        String film16thriller = "Вы выбрали фильмы с жанром триллер с возрастным ограничением 16+\nи я рекомендую вам:" +
                "\nТелекинез (Рейтинг 5.9) -> https://www.kinopoisk.ru/film/675631/" +
                "\nВремя (Рейтинг 6.4) -> https://www.kinopoisk.ru/film/1379090/" +
                "\nОстров фантазий (Рейтинг 5.8) -> https://www.kinopoisk.ru/film/462193/" +
                "\nТайное окно (Рейтинг 7.2) -> https://www.kinopoisk.ru/film/4304/" +
                "\nМилые обманщицы (Рейтинг 8.1) -> https://www.kinopoisk.ru/series/505748/";
        String film16crime = "Вы выбрали фильмы с жанром криминал с возрастным ограничением 16+\nи я рекомендую вам:" +
                "\nПоследний наемник (Рейтинг 5.8) -> https://www.kinopoisk.ru/film/4696433/" +
                "\nИллюзия обмана (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/522892/" +
                "\nБрат (Рейтинг 8.3) -> https://www.kinopoisk.ru/film/41519/" +
                "\nЛеон (Рейтинг 8.7) -> https://www.kinopoisk.ru/film/389/" +
                "\nЗаконопослушный гражданин (Рейтинг 8.0) -> https://www.kinopoisk.ru/film/406408/";
        String film16fantastic  = "Вы выбрали фильмы с жанром фантастика с возрастным ограничением 16+\nи я рекомендую вам:" +
                "\nСтражи галактики (Рейтинг 7.9) -> https://www.kinopoisk.ru/film/689066/" +
                "\nФантастические твари (Рейтинг 7.6) -> https://www.kinopoisk.ru/film/797840/" +
                "\nМир юрского периода (Рейтинг 6.9) -> https://www.kinopoisk.ru/film/594554/" +
                "\nБегущий в лабиринти (Рейтинг 6.8) -> https://www.kinopoisk.ru/film/575613/" +
                "\nАватар (Рейтинг 8.0) -> https://www.kinopoisk.ru/film/251733/";
        String film16horror = "Вы выбрали фильмы с жанром ужасы с возрастным ограничением 16+\nи я рекомендую вам:" +
                "\nОно (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/453397/" +
                "\nОтмель (Рейтинг 6.3) -> https://www.kinopoisk.ru/film/928626/" +
                "\nАталантида (Рейтинг 5.8) -> https://www.kinopoisk.ru/film/678639/" +
                "\nИнкарнация (Рейтинг 5.4) -> https://www.kinopoisk.ru/film/800574/";
        String film16sports = "Вы выбрали фильмы с жанром спорт с возрастным ограничением 16+\nи я рекомендую вам:" +
                "\nВыкрутасы (Рейтинг 6.3) -> https://www.kinopoisk.ru/film/471158/" +
                "\nГонка (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/596125/" +
                "\nРегби (Рейтинг 8.2) -> https://www.kinopoisk.ru/series/1338269/" +
                "\n42 (Рейтинг 7.5) -> https://www.kinopoisk.ru/film/102260/";
        String film16comedy = "Вы выбрали фильмы с жанром комедия с возрастным ограничением 16+\nи я рекомендую вам:" +
                "\n1+1 (Рейтинг 8.8) -> https://www.kinopoisk.ru/film/535341/" +
                "\nПоймай меня если сможешь (Рейтинг 8.5) -> https://www.kinopoisk.ru/film/324/" +
                "\nМы-Миллеры (Рейтинг 7.2) -> https://www.kinopoisk.ru/film/582170/" +
                "\nКруэлла (Рейтинг 7.6) -> https://www.kinopoisk.ru/film/804662/" +
                "\nМаска (Рейтинг 8.0) -> https://www.kinopoisk.ru/film/6039/";
        String film16fantasy = "Вы выбрали фильмы с жанром фэнтези с возрастным ограничением 16+\nи я рекомендую вам:" +
                "\nСпайдервик (Рейтинг 6.8) -> https://www.kinopoisk.ru/film/81926/" +
                "\nДжек - покоритель великанов (Рейтинг 6.3) -> https://www.kinopoisk.ru/film/462453/" +
                "\nКаролина в стране кошмаров (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/49166/" +
                "\nБрюс всемогущий (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/39577/" +
                "\nКонстантин: повелитель тьмы (Рейтинг 7.9) -> https://www.kinopoisk.ru/film/3793/";
        String film16romance = "Вы выбрали фильмы с жанром романтика с возрастным ограничением 16+\nи я рекомендую вам:" +
                "\nЗаколдованная Элла (Рейтинг 6.8) -> https://www.kinopoisk.ru/film/1713/" +
                "\nПринц из рая (Рейтинг 6.6) -> https://www.kinopoisk.ru/film/5082344/" +
                "\nСтрашно красив (Рейтинг 6.2) -> https://www.kinopoisk.ru/film/450470/" +
                "\nКрасавица и чудовище (Рейтинг 8.3) -> https://www.kinopoisk.ru/film/540/" +
                "\nС любовью Рози (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/512784/";
        String film16action = "Вы выбрали фильмы с жанром боевик с возрастным ограничением 16+\nи я рекомендую вам:" +
                "\nДевергент (Рейтинг 6.7) -> https://www.kinopoisk.ru/film/582101/" +
                "\nПираты карибского моря (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/63991/" +
                "\nЧерный рыдцарь (Рейтинг 6.5) -> https://www.kinopoisk.ru/film/8110/" +
                "\nФорсаж 7 (Рейтинг 7.0) -> https://www.kinopoisk.ru/film/754481/" +
                "\nПаркер (Рейтинг 6.7) -> https://www.kinopoisk.ru/film/586475/\";\n";
        String film16adventure = "Вы выбрали фильмы с жанром приключение с возрастным ограничением 16+\nи я рекомендую вам:" +
                "\nГолодные игры (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/468581/" +
                "\nЗвездная пыль (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/197863/" +
                "\nХоббит: нежданное путешествие (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/278522/" +
                "\nАквамен (Рейтинг 6.8) -> https://www.kinopoisk.ru/film/470178/" +
                "\nШерлок Холмс (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/420923/";
        String film16mystery = "Вы выбрали фильмы с жанром мистика с возрастным ограничением 16+\nи я рекомендую вам:" +
                "\nЯга (Рейтинг 5.5) -> https://www.kinopoisk.ru/film/1124682/" +
                "\nЗнакомьтесь Джо Блэк (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/5059/" +
                "\nМашинист (Рейтинг 7.6) -> https://www.kinopoisk.ru/film/5206/" +
                "\nЗагадочная история Бенджамина Баттона (Рейтинг 8.1) -> https://www.kinopoisk.ru/film/81555/" +
                "\nШестое чувство (Рейтинг 8.2) -> https://www.kinopoisk.ru/film/395/";
        String film16anime = "Вы выбрали фильмы с жанром аниме с возрастным ограничением 16+\nи я рекомендую вам:" +
                "\nЧерный клевер (Рейтинг 8.1) -> https://www.kinopoisk.ru/series/1049731/" +
                "\nСемь смертных грехов (Рейтинг 7.6) -> https://www.kinopoisk.ru/series/843954/" +
                "\nНаруто (Рейтинг 8.3) -> https://www.kinopoisk.ru/series/281884/" +
                "\nВан-Пис (Рейтинг 8.4) -> https://www.kinopoisk.ru/series/382731/" +
                "\nБлич (Рейтинг 8.0) -> https://www.kinopoisk.ru/series/258621/";
        String film18anime = "Вы выбрали аниме с возрастным ограничением 18+\nи я рекомендую вам:" +
                "\nПоднятие уровня в одиночку (Рейтинг 8.3) -> https://www.kinopoisk.ru/series/5230828/" +
                "\nАтака Титанов (Рейтинг 8.7) -> https://www.kinopoisk.ru/series/749374/" +
                "\nТокийский Гуль (Рейтинг 7.1) -> https://www.kinopoisk.ru/series/841681/" +
                "\nМагическая битва (Рейтинг 8.1) -> https://www.kinopoisk.ru/series/1381125/" +
                "\nКлинок, рассеккающий демонов (Рейтинг 8.2) -> https://www.kinopoisk.ru/series/1220920/";
        String film18thriller = "Вы выбрали фильмы с жанром триллер с возрастным ограничением 18+\nи я рекомендую вам:" +
                "\nСплит (Рейтинг 7.0) -> https://www.kinopoisk.ru/film/930534/" +
                "\nПерсона (Рейтинг 8.0) -> https://www.kinopoisk.ru/film/79506/" +
                "\nЯ иду искать (Рейтинг 6.9) -> https://www.kinopoisk.ru/film/1198736/" +
                "\nСияние (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/409/" +
                "\nАферистка (Рейтинг 6.7) -> https://www.kinopoisk.ru/film/1248786/";
        String film18horror = "Вы выбрали фильмы с жанром ужасы с возрастным ограничением 18+\nи я рекомендую вам:" +
                "\nАстрал (Рейтинг 6.8) -> https://www.kinopoisk.ru/film/495892/" +
                "\nОбитель зла (Рейтинг 7.6) -> https://www.kinopoisk.ru/film/801/" +
                "\nИ гаснет свет (Рейтинг 5.9) -> https://www.kinopoisk.ru/film/919515/" +
                "\nНе стучи дважды (Рейтинг 4.9) -> https://www.kinopoisk.ru/film/910183/" +
                "\nМаршрут построен (Рейтинг 4.0) -> https://www.kinopoisk.ru/film/933852/";
        String film18action = "Вы выбрали фильмы с жанром боевик с возрастным ограничением 18+\nи я рекомендую вам:" +
                "\nГангстер поп и дьявол (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/1177510/" +
                "\nДжон Уик (Рейтинг 7.0) -> https://www.kinopoisk.ru/film/762738/" +
                "\nВне/себя (Рейтинг 6.9) -> https://www.kinopoisk.ru/film/655435/" +
                "\nПереводчик (Рейтинг 7.9) -> https://www.kinopoisk.ru/film/927898/" +
                "\nДэдпул (Рейтинг 7.6) -> https://www.kinopoisk.ru/film/462360/";
        String film18mystery = "Вы выбрали фильмы с жанром мистика с возрастным ограничением 18+\nи я рекомендую вам:" +
                "\nГоголь (Рейтинг 6.8) -> https://www.kinopoisk.ru/series/1232164/" +
                "\nТихое место (Рейтинг 6.8) -> https://www.kinopoisk.ru/film/1044906/" +
                "\nКод да винчи (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/77711/" +
                "\nОбитель теней (Рейтинг 7.1) -> https://www.kinopoisk.ru/film/992500/" +
                "\nДитя тьмы (Рейтинг 6.9) -> https://www.kinopoisk.ru/film/400615/";
        String film18detective = "Вы выбрали фильмы с жанром детектив с возрастным ограничением 18+\nи я рекомендую вам:" +
                "\nОстров проклятых (Рейтинг 8.5) -> https://www.kinopoisk.ru/film/397667/" +
                "\nВоспоминания об убийстве (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/65770/" +
                "\nЗодиак (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/102838/" +
                "\nТело (Рейтинг 7.3) -> https://www.kinopoisk.ru/film/609349/" +
                "\nДевушка с татуировкой драконо (Рейтинг 7.8) -> https://www.kinopoisk.ru/film/491724/";
        String film18crime = "Вы выбрали фильмы с жанром криминал с возрастным ограничением 18+\nи я рекомендую вам:" +
                "\nПодмена (Рейтинг 7.9) -> https://www.kinopoisk.ru/film/279880/" +
                "\nДжентльмены (Рейтинг 8.6) -> https://www.kinopoisk.ru/film/1143242/" +
                "\nЗеленая миля (Рейтинг 9.1) -> https://www.kinopoisk.ru/film/435/" +
                "\nБрат (Рейтинг 8.3) -> https://www.kinopoisk.ru/film/41519/" +
                "\nДжокер (Рейтинг 8.0) -> https://www.kinopoisk.ru/film/1048334/" +
                "\nВолк с Уолл-Стрит (Рейтинг 8.0) -> https://www.kinopoisk.ru/film/462682/";
        String film18comedy = "Вы выбрали фильмы с жанром комедия с возрастным ограничением 18+\nи я рекомендую вам:" +
                "\nТретий лишний (Рейтинг 6.7) -> https://www.kinopoisk.ru/film/507817/" +
                "\nШпион (Рейтинг 7.9) -> https://www.kinopoisk.ru/series/4476421/" +
                "\nБатя (Рейтинг 7.7) -> https://www.kinopoisk.ru/film/1326397/" +
                "\nЛулу и бриггс (Рейтинг 7.4) -> https://www.kinopoisk.ru/film/1355139/" +
                "\nМальчишник в Вегасе (Рейтинг 7.9) -> https://www.kinopoisk.ru/film/426004/";

            if (message != null && message.hasText()) {
                switch (message.getText()) {
                    case "/start":
                        sendMsg(message, start);
                        break;
                    case "/menu":
                        sendMsg(message, menu);
                        break;
                    case "/age":
                        sendMsg(message, age);
                        break;
                    case "/genre":
                        sendMsg(message, genre);
                        break;
                    case "/genre 0":
                        sendMsg(message, ze);
                        break;
                    case "/genre 8":
                        sendMsg(message, si);
                        break;
                    case "/genre 12":
                        sendMsg(message, tw);
                        break;
                    case "/genre 16":
                        sendMsg(message, six);
                        break;
                    case "/genre 18":
                        sendMsg(message, ei);
                        break;
                    case "/film 0 мультфильм":
                        sendMsg(message, film0cartoons);
                        break;
                    case "/film 0 сказка":
                        sendMsg(message, film0tale);
                        break;
                    case "/film 0 приключение":
                        sendMsg(message, film0adventure);
                        break;
                    case "/film 0 фэнтези":
                        sendMsg(message, film0fantasy);
                        break;
                    case "/film 0 комедия":
                        sendMsg(message, film0comedy);
                        break;
                    case "/film 0 семейный":
                        sendMsg(message, film0family);
                        break;
                    case "/film 0 мультсериал":
                        sendMsg(message, film0series);
                        break;
                    case "/film 6 мультфильм":
                        sendMsg(message, film6cartoons);
                        break;
                    case "/film 6 приключение":
                        sendMsg(message, film6adventure);
                        break;
                    case "/film 6 фэнтези":
                        sendMsg(message, film6fantasy);
                        break;
                    case "/film 6 комедия":
                        sendMsg(message, film6comedy);
                        break;
                    case "/film 6 семейный":
                        sendMsg(message, film6family);
                        break;
                    case "/film 6 фантастика":
                        sendMsg(message, film6fantastic);
                        break;
                    case "/film 6 аниме":
                        sendMsg(message, film6anime);
                        break;
                    case "/film 12 приключение":
                        sendMsg(message, film12adventure);
                        break;
                    case "/film 12 драма":
                        sendMsg(message, film12drama);
                        break;
                    case "/film 12 боевик":
                        sendMsg(message, film12action);
                        break;
                    case "/film 12 комедия":
                        sendMsg(message, film12comedy);
                        break;
                    case "/film 12 фэнтези":
                        sendMsg(message, film12fantasy);
                        break;
                    case "/film 12 спорт":
                        sendMsg(message, film12sport);
                        break;
                    case "/film 12 аниме":
                        sendMsg(message, film12anime);
                        break;
                    case "/film 16 драма":
                        sendMsg(message, film16drama);
                        break;
                    case "/film 16 триллер":
                        sendMsg(message, film16thriller);
                        break;
                    case "/film 16 криминал":
                        sendMsg(message, film16crime);
                        break;
                    case "/film 16 фантастика":
                        sendMsg(message, film16fantastic);
                        break;
                    case "/film 16 ужасы":
                        sendMsg(message, film16horror);
                        break;
                    case "/film 16 спорт":
                        sendMsg(message, film16sports);
                        break;
                    case "/film 16 комедия":
                        sendMsg(message, film16comedy);
                        break;
                    case "/film 16 фэнтези":
                        sendMsg(message, film16fantasy);
                        break;
                    case "/film 16 романтика":
                        sendMsg(message, film16romance);
                        break;
                    case "/film 16 боевик":
                        sendMsg(message, film16action);
                        break;
                    case "/film 16 приключение":
                        sendMsg(message, film16adventure);
                        break;
                    case "/film 16 мистика":
                        sendMsg(message, film16mystery);
                        break;
                    case "/film 16 аниме":
                        sendMsg(message, film16anime);
                        break;
                    case "/film 18 аниме":
                        sendMsg(message, film18anime);
                        break;
                    case "/film 18 триллер":
                        sendMsg(message, film18thriller);
                        break;
                    case "/film 18 ужасы":
                        sendMsg(message, film18horror);
                        break;
                    case "/film 18 боевик":
                        sendMsg(message, film18action);
                        break;
                    case "/film 18 мистика":
                        sendMsg(message, film18mystery);
                        break;
                    case "/film 18 детектив":
                        sendMsg(message, film18detective);
                        break;
                    case "/film 18 криминал":
                        sendMsg(message, film18crime);
                        break;
                    case "/film 18 комедия":
                        sendMsg(message, film18comedy);
                        break;
                    default:
                        sendMsg(message, other);
                        break;
                }
            }
        }
}