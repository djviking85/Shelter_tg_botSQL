CREATE TABLE shelter
(
    name        TEXT,
    type        TEXT PRIMARY KEY,
    description TEXT,
    instruction TEXT
);
INSERT INTO shelter (name, description, type, instruction)
VALUES ('Собачье сердце', 'Наш приют для собак называется "Собачье сердце" и находится по адресу ул. Щербакова, 23, г. Город X
Приют работает круглосуточно, чтобы принимать и ухаживать за животными в любое удобное время для их хозяев.
Как добраться до приюта: можно доехать на автобусе № 15 и выйти на остановке "Щербакова", затем пройти по улице еще примерно 200 метров в сторону центра города.\n\n
Перед посещением приюта важно ознакомиться с правилами техники безопасности. Сотрудники приюта рекомендуют заходить на территорию только после предварительного звонка или записи на прием, чтобы избежать перегрузки в приюте. Также нужно соблюдать основные правила поведения с животными и не приносить на территорию приюта еду для собак без предварительного согласования.\n\n
В приюте "Собачье сердце" собакам обеспечивают качественный уход, включая ежедневные прогулки и кормление. Здесь можно выбрать нового друга-собаку и даже поучаствовать в организации благотворительных мероприятий в пользу животных.\n\n
Для оформления пропуска заранее оставьте свои данные на пункт охраны, тел. +7-000-00-00 ', 'DOG',
        'Список документов, необходимых для того, чтобы взять животное из приюта: паспорт гражданина РФ.
        Список рекомендаций по транспортировке животного:
            1. Проверьте требования перевозчика на транспортировку животных.
            2. Необходимо выбрать специальный контейнер, чтобы животное было в безопасности. Материал контейнера должен быть крепким и легким.
            3. Контейнер должен быть достаточно большим, чтобы животное могло свободно двигаться и поворачиваться.
        Список рекомендаций по обустройству дома для собаки:
            1. Подготовите уютное место для сна, где собака будет чувствовать себя комфортно.
            2. Миски должны быть изготовлены из материалов безопасных для здоровья собаки, размер посуды и её место должны соответствовать размерам и породе собаки.
            3. Нужны игрушки для собаки, такие как мячи, кости, игрушки на веревке и другие. Они помогут занять собаку и предотвратить скучность.
            4. Создайте безопасную зону для щенка, где он будет чувствовать себя комфортно и не будет беспокоиться о своей безопасности. Например, это может быть зона в комнате с перегородкой или забором.
        Список дополнительных рекомендаций по обустройству дома для животного с ограниченными возможностями (зрение, передвижение)
            1. Необходимо сделать дом безопасным для животного, установив противоскользящие коврики на полу, чтобы избежать падений и травм.
            2. Если животное имеет ограниченное зрение, необходимо установить яркие и контрастные светильники по всему дому, чтобы улучшить его видимость.
            3. Необходимо держать еду и воду в удобном месте, чтобы животное могло добраться до них без проблем.
            4. Для социализации с другими животными или людьми, животному с ограниченными возможностями может понадобиться специальное обучение, поэтому необходимо обратиться к ветеринару для получения рекомендаций.
        Советы кинолога по первичному общению с собакой:
            1. Не навязывайте свое общение сразу после знакомства. Дайте собаке время понять, что вы не являетесь угрозой.
            2. Не трогайте собаку сразу. Позвольте ей подойти к вам и нюхнуть вас.
            3. Говорите с собакой мягким и утвердительным голосом. Не кричите на нее и не использовайте громкие звуки.
            4. Избегайте быстрых движений и резких жестов. Они могут напугать собаку.
            5. Будьте внимательны к языку тела собаки. Так вы смежите понять , что собака чувствует.
        Существует несколько причин, по которым приют может отказать в выдаче собаки:
            1. Не соответствующие условия проживания.
            2. Необходимый опыт и знания
            3. Финансовые ограничения
            4. Несоответствие задачам и потребностям животного. '),
       ('Кошачье сердце', 'Наш приют для кошек, который находится в городе Голденхилл на улице Кошачьей Милости, 20, называется «Кошачье сердце». Приют работает ежедневно с 9 утра до 6 вечера.
Схема проезда до приюта такая: с центральной площади Голденхилла нужно свернуть на улицу Бартелл и ехать прямо до остановки "Прекрасная кошка". Далее нужно повернуть на улицу Кошачьей Милости и проехать еще 100 метров. Приют находится на правой стороне дороги, имеет котаную вывеску и большой забор.
Для техники безопасности на территории приюта рекомендуется соблюдать следующие правила:
    1. Нужно точно следовать инструкциям и указаниям персонала.
    2. Нельзя кормить животных из рук, без разрешения персонала.
    3. Нужно бережно обращаться с животными и не дразнить их.
    4. Нельзя проникать на территорию приюта после закрытия, без разрешения персонала.
Приют для кошек - это уютное место, где животные получают помощь и любовь от персонала и волонтеров. Он очень важен для всех животных, потому что предоставляет им дом и заботу в трудный период их жизни. Если вы заинтересованы в волонтерстве, вы можете связаться с приютом и узнать о возможностях помощи.
Для оформления пропуска заранее оставьте свои данные на пункт охраны, тел. +7-000-00-00 ', 'CAT',
        'Список документов, необходимых для того, чтобы взять животное из приюта: паспорт гражданина РФ.
        Список рекомендаций по транспортировке животного:
            1. Проверьте требования перевозчика на транспортировку животных.
            2. Необходимо выбрать специальный контейнер, чтобы животное было в безопасности. Материал контейнера должен быть крепким и легким.
            3. Контейнер должен быть достаточно большим, чтобы животное могло свободно двигаться и поворачиваться.
        Список рекомендаций по обустройству дома для кота/кошки:
            1. Подготовите уютное место для сна, где кот/кошка будет чувствовать себя комфортно.
            2. Миски должны быть изготовлены из материалов безопасных для здоровья, размер посуды и её место должны соответствовать размерам и породе собаки.
            3. Нужны игрушки для кота/кошки, такие как мягкие игрушки, игрушки на веревке и другие.
            4. Создайте безопасную зону для котенка, где он будет чувствовать себя комфортно и не будет беспокоиться о своей безопасности. Например, это может быть зона в комнате с перегородкой или забором.
        Список дополнительных рекомендаций по обустройству дома для животного с ограниченными возможностями (зрение, передвижение)
            1. Необходимо сделать дом безопасным для животного, установив противоскользящие коврики на полу, чтобы избежать падений и травм.
            2. Если животное имеет ограниченное зрение, необходимо установить яркие и контрастные светильники по всему дому, чтобы улучшить его видимость.
            3. Необходимо держать еду и воду в удобном месте, чтобы животное могло добраться до них без проблем.
            4. Для социализации с другими животными или людьми, животному с ограниченными возможностями может понадобиться специальное обучение, поэтому необходимо обратиться к ветеринару для получения рекомендаций.
        Существует несколько причин, по которым приют может отказать в выдаче кота/кошки:
            1. Не соответствующие условия проживания.
            2. Необходимый опыт и знания
            3. Финансовые ограничения
            4. Несоответствие задачам и потребностям животного.');

CREATE TABLE users
(
    id      BIGINT PRIMARY KEY,
    name    TEXT,
    email   TEXT,
    phone   TEXT,
    chat_id  BIGINT

);

CREATE TABLE report
(
    id         BIGINT,
    users_id    BIGINT,
    report_text TEXT,
    FOREIGN KEY (users_id) REFERENCES users(id)
)