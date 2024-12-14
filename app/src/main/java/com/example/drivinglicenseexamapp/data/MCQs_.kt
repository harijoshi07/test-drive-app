package com.example.drivinglicenseexamapp.data

fun getSampleQuestions1() {

    val quizQuestions1 = listOf(
        Question(
            questionText = "जेब्रा क्रसिङ केका लागि प्रयोग गरिन्छ?",
            optionA = "उभिन",
            optionB = "पैदल यात्रीले बाटो काट्न",
            optionC = "गाडी रोक्न",
            optionD = "गाडी कुदाउन",
            correctOptionIndex = 1 // Corresponds to option B ("पैदल यात्रीले बाटो काट्न")
        ),
        Question(
            questionText = "आपूभान अगाडि को गाडीको सिफारिस कम हुदै गएका केबाट थाहा हुन्छ?",
            optionA = "ब्रेक लाइटबाट",
            optionB = "चालकको ईशाराबाट",
            optionC = "साइलेंसरमा धुवाँ कम भएकोबाट",
            optionD = "कुनै पनि होइन",
            correctOptionIndex = 1 // Replace with correct option index when known
        ),
        Question(
            questionText = "सडक पार गर्दा कसलाई प्राथमिकता दिनु पर्छ?",
            optionA = "स्कूले विद्यार्थीलाई",
            optionB = "शारीरिक अपाङ्गता भएका व्यक्तिलाई",
            optionC = "ज्येष्ठ नागरिकलाई",
            optionD = "माथिका सबै",
            correctOptionIndex = 3 // Corresponds to option D ("माथिका सबै")
        ),
        Question(
            questionText = "सडकमा सवारी चालकलाई साधारणतया पहिलो प्राथमिकता दिनु पर्छ?",
            optionA = "शव वाहन",
            optionB = "दमकल",
            optionC = "एम्बुलेन्स",
            optionD = "माथिका सबै",
            correctOptionIndex = 3 // Corresponds to option D ("माथिका सबै")
        ),
        Question(
            questionText = "अगाडि को सवारी साधनलाई ओभरटेक गर्न के गर्न पर्छ?",
            optionA = "हेड लाइट बालेर",
            optionB = "हर्न बजाएर",
            optionC = "साइड लाइट बालेर",
            optionD = "माथिका सबै",
            correctOptionIndex = 3 // Corresponds to option D ("माथिका सबै")
        ),
        Question(
            questionText = "नेपालमा कुन साइडबाट सवारी चलाइन्छ?",
            optionA = "दायाँ साइडबाट",
            optionB = "बाँया साइडबाट",
            optionC = "जुन पायो त्यही साइडबाट",
            optionD = "माथिका कुनै पनि होइनन्",
            correctOptionIndex = 1 // Corresponds to option B ("बाँया साइडबाट")
        ),
        Question(
            questionText = "कुन रफ्तार तुलनात्मक रूपमा इन्धनको खपत कम हुन्छ?",
            optionA = "स्लो रफ्तार",
            optionB = "मेडियम रफ्तार",
            optionC = "हाई रफ्तार",
            optionD = "स्लो र मेडियम रफ्तार",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "तपाईंको सवारी पछाडि एम्बुलेन्स आएमा के गर्नुपर्छ?",
            optionA = "गाडी रोक्ने",
            optionB = "साइड दिने",
            optionC = "स्पीड बढाउने",
            optionD = "ओभरटेक गर्ने",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "कस्तो सडकमा ब्रेक फेल हुँदा सबैभन्दा बढी खतरा हुन्छ?",
            optionA = "उकालो सडकमा",
            optionB = "ओरालो सडकमा",
            optionC = "समथर सडकमा",
            optionD = "कच्ची सडकमा",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "कुन रफ्तारमा सवारी चलाउँदा तुलनात्मक रूपमा इन्धनको खपत बढी हुन्छ?",
            optionA = "स्लो स्पीडमा",
            optionB = "मिडियम स्पीडमा",
            optionC = "हाई स्पीडमा",
            optionD = "माथिका सबै",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "ओरालोमा झरिरहेको र उकालोमा चढिरहेको सवारीमध्ये कुनले साइड दिनुपर्छ?",
            optionA = "उकालो चढ्नेलाई",
            optionB = "ओरालो झर्नेले",
            optionC = "क र ख दुबैले",
            optionD = "कुनै पनि होइन",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "घुमेर जाने र सिधा जाने सवारीमध्ये कुन सवारीले प्राथमिकता पाउँछ?",
            optionA = "घुमेर जाने",
            optionB = "सिधा जाने",
            optionC = "दुबैले",
            optionD = "कुनै पनि होइन",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "गियर किन परिवर्तन गरिन्छ?",
            optionA = "स्पीड घटाउन",
            optionB = "स्पीड बढाउन",
            optionC = "हर्न बजाउन",
            optionD = "स्पीड घटाउन र बढाउन",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "नेपालमा ढिलो गतिमा चल्ने सवारीलाई सडकको कुन साइडबाट चलाउनुपर्छ?",
            optionA = "बीचबाट",
            optionB = "दायाँबाट",
            optionC = "बायाँबाट",
            optionD = "आफूलाई मन लागेको साइडबाट",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "चार पाङ्ग्रे सवारीमा खुल्लाले के के नियन्त्रण गर्छ?",
            optionA = "क्लच",
            optionB = "ब्रेक",
            optionC = "एक्सिलेटर",
            optionD = "माथिका सबै",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "उकालोमा र ओरालोमा जानेमध्ये कुन चाँहि सवारीलाई प्राथमिकता दिनुपर्छ?",
            optionA = "ओरालोमा गएकाे सवारीलाई",
            optionB = "उकालोमा गएकाे सवारीलाई",
            optionC = "साईडिनु पर्दैन",
            optionD = "जिसले सकेको उसले बढी बढाउनुपर्छ",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "कुन सवारी साधन सडकमा गुड्दैन?",
            optionA = "पानी जहाज",
            optionB = "प्लेन",
            optionC = "हेलिकप्टर",
            optionD = "माथिका सबै",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "चालकले आफ्नोभन्दा अगाडिको स्पीड बढे घटेको कसरी/थाहा पाउनु पर्छ?",
            optionA = "अगाडिको चालकलाई सोधेर",
            optionB = "चालकको इशाराबाट",
            optionC = "आफैले अनुमान गरेर",
            optionD = "कुनै पनि होइन",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "आयल प्रेसरले सवारीमा के को अवस्था देखाउँछ?",
            optionA = "डिजेलको",
            optionB = "मोविलको",
            optionC = "पानीको",
            optionD = "पेट्रोलको",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "सिटबेल्टको प्रयोग कहिले गर्नुपर्छ?",
            optionA = "अगाडि बस्ने सबैले लगाउने",
            optionB = "पुलिसले देखेपछि मात्रै लगाउने",
            optionC = "ओरालोमा लगाउने",
            optionD = "उकालोमा लगाउने",
            correctOptionIndex = 0
        ),
        Question(
            questionText = "सडकमा सवारी चलाउँदा कस्तो सवारी साधनलाई पहिलो प्राथमिकता दिनुपर्दैन?",
            optionA = "कार",
            optionB = "मोटरसाइकल",
            optionC = "ट्रक",
            optionD = "माथिका सबै",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "पछाडिको सवारी साधनलाई अगाडि जान दिन के गर्नु पर्छ?",
            optionA = "हातले इशारा दिने",
            optionB = "साइडलाइट बालिदिने",
            optionC = "क र ख दुबै",
            optionD = "कुनै पनि होइन",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "नेपालमा कुन साइडबाट सवारी चलाउँदा कारवाही हुन्छ?",
            optionA = "दायाँ साइडबाट",
            optionB = "बायाँ साइडबाट",
            optionC = "क र ख दुबै",
            optionD = "कुनै पनि होइन",
            correctOptionIndex = 0
        ),
        Question(
            questionText = "चार पाङ्ग्रे सवारीमा बायाँ हातको मुख्य काम के हो?",
            optionA = "ब्रेक लगाउने",
            optionB = "घाइरिल समाउने",
            optionC = "ह्याण्ड ब्रेक लगाउने",
            optionD = "माथिका सबै",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "तपाईंको पछाडि दमकल आए के गर्नुपर्छ?",
            optionA = "गाडी रोक्ने",
            optionB = "साईड दिने",
            optionC = "स्पीड बढाउने",
            optionD = "वास्ता नै नगर्ने",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "गाडी टर्निङ्ग गर्दा के गर्नु पर्छ?",
            optionA = "साईड लाइट बाल्ने",
            optionB = "गति कम गर्ने",
            optionC = "दायाँ बायाँ हेर्ने",
            optionD = "माथिका सबै",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "कस्तो सवारीलाई प्राथमिकता दिनु पर्छ?",
            optionA = "ओरालो जाने",
            optionB = "उकालो चढ्ने",
            optionC = "माथिका दुवै",
            optionD = "माथिका कुनै पनि होइनन्",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "स्पीड घटाउन वा बढाउन के गर्नु पर्छ?",
            optionA = "गियर परिवर्तन गर्ने",
            optionB = "एक्सिलेटर बढाउने/घटाउने",
            optionC = "क र ख दुवै",
            optionD = "कुनै पनि होइन",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "छिटो गतिमा चलाउने सवारीलाई सडकको कुन लेनबाट चलाउन पर्छ?",
            optionA = "बीचको लेनबाट",
            optionB = "छेउको लेनबाट",
            optionC = "माथिका दुवै",
            optionD = "कुनै पनि होइन",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "सामान्यतः हेड लाइट कुन समयमा बालिन्छ?",
            optionA = "दिनमा",
            optionB = "अँध्यारोमा",
            optionC = "ट्राफिक प्रहरीलाई देखेमा",
            optionD = "दुर्घटना भएमा",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "पटकै बाटो इजाजत भन्नाले के बुझिन्छ?",
            optionA = "इजाजत लिएको बाटोमा मात्र सवारी चलाउने",
            optionB = "इजाजत प्राप्त गरेको बाटोमा सवारी चलाउने अनुमति",
            optionC = "स्थानीय बाटोमा सवारी चलाउने अनुमति",
            optionD = "पटक पटक सवारी चलाउने",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "सवारी चालक अनुमति पत्र प्राप्त नगरी के गर्न हुँदैन?",
            optionA = "सवारी चलाउन हुँदैन",
            optionB = "सवारी बस्नु हुँदैन",
            optionC = "सवारी खरिद गर्न हुँदैन",
            optionD = "माथिका कुनै पनि होइन",
            correctOptionIndex = 0
        ),
        Question(
            questionText = "बि.आई.पी. सवारी चलेको बेला आफ्नो सवारीलाई के गर्नु पर्छ?",
            optionA = "गाडी रोकी साईड दिने",
            optionB = "हर्न बजाउने",
            optionC = "गाडी कुदाउने",
            optionD = "माथिका सबै",
            correctOptionIndex = 0
        ),
        Question(
            questionText = "ट्राफिक प्रहरीले गल्ती देखाई सवारिलाई रोकेमा कसतो व्यवहार गर्नुपर्छ?",
            optionA = "मेरो गल्ती नै छैन भनी जिद्दि गर्ने",
            optionB = "ट्राफिक प्रहरीलाई छलि भाग्ने",
            optionC = "नत्रता पूर्वक गल्ती महसुस गर्ने",
            optionD = "मेरो गल्ती छैन भनी अरु चालकलाई साक्षी बनाउने",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "सवारीमा इन्धन कति मात्रामा राखे राम्रो हुन्छ?",
            optionA = "अतिकम मात्र राख्ने",
            optionB = "आधा ट्यांक राख्ने",
            optionC = "सक्दो कम मात्र हाल्ने",
            optionD = "सक्दो फुल ट्यांक राख्ने",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "कसतो सवारी यातायात सेवाका लागि प्रयोग गर्न पाइँदैन?",
            optionA = "निजी सवारी",
            optionB = "सार्वजनिक सवारी",
            optionC = "पर्यटक सवारी",
            optionD = "माथिका सबै",
            correctOptionIndex = 0
        ),
        Question(
            questionText = "परिचालक भन्नाले कसलाई बुझाउँछ?",
            optionA = "सवारी चलाउनेलाई",
            optionB = "लाइसेन्स प्राप्त व्यक्तिलाई",
            optionC = "सवारीमा काम गर्ने सहयोगीलाई",
            optionD = "माथिका कुनै पनि होइनन्",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "L अक्षर लेखिएका सवारी कस्ता सवारी हुन्?",
            optionA = "सरकारी सवारी साधन",
            optionB = "सिकाइ सवारी साधन",
            optionC = "कूटनीतिक सवारी साधन",
            optionD = "सार्वजनिक सवारी साधन",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "ओभरटेक गर्दा अगाडिको साधनलाई कसरी संकेत दिनु पर्छ?",
            optionA = "फोन गरेर रोक्न अनुरोध गर्ने",
            optionB = "हातले इशारा दिने",
            optionC = "हर्न बजाउने",
            optionD = "माथिका कुनै पनि होइन",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "लुकिङ्ग ग्लासको प्रयोग कुन प्रयोजनका लागि गरिन्छ?",
            optionA = "ओभरटेक गर्दा",
            optionB = "व्याक गर्दा",
            optionC = "माथिका दुबै",
            optionD = "कुनैपनि होइन",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "सवारी चालकमा कस्ता गुण हुनु पर्छ?",
            optionA = "धैर्यवान्",
            optionB = "मिठो बोल्ने",
            optionC = "मिलनसार",
            optionD = "माथिका सबै",
            correctOptionIndex = 4
        ),
        Question(
            questionText = "सुरक्षित यात्राको लागि के गर्नु पर्छ?",
            optionA = "ट्राफिक नियमको पालना गर्ने",
            optionB = "जथाभावी सवारी चलाउने",
            optionC = "तित्र गतिमा सवारी चलाउने",
            optionD = "माथिका सबै",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "पानी परेका बेला अगाडि केही नदेखे के गर्नु पर्दछ?",
            optionA = "वाइपर चलाउने",
            optionB = "गति बढाउने",
            optionC = "गाडी रोक्ने",
            optionD = "हर्न बजाउने",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "ओरालोमा गाडी पार्किङ गर्दा कुन गियरमा राख्नु राम्रो हुन्छ?",
            optionA = "१ न. गियरमा",
            optionB = "३ न. गियरमा",
            optionC = "व्याक गियरमा",
            optionD = "५ न. गियरमा",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "विद्युतीय सवारीमा तलकामध्ये के हुँदैन?",
            optionA = "साइलन्सर पाइप",
            optionB = "एक्सिलेरेटर",
            optionC = "क्लच",
            optionD = "गियर",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "सवारीको नम्बर प्लेटमा बा १ ब संकेत भएको सवारी कस्तो सवारी हुन्छ?",
            optionA = "निजी मोटर साइकल",
            optionB = "सरकारी मोटर साइकल",
            optionC = "संस्थानका मोटर साइकल",
            optionD = "भाडाको मोटर साइकल",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "सवारी साधन कर तलकामध्ये कुन कार्यालयमा बुझाउनु पर्दछ?",
            optionA = "आन्तरिक राजस्व कार्यालय",
            optionB = "भन्सार कार्यालय",
            optionC = "यातायात व्यवस्था कार्यालय",
            optionD = "अन्तशुल्क कार्यालय",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "इम्बोस्ड नम्बर प्लेट बिग्रिए के गर्नुपर्दछ?",
            optionA = "आफै खुशी फेर्ने",
            optionB = "यातायात व्यवस्था कार्यालयमा गई निवेदन दिएर फेर्ने",
            optionC = "बिक्रीको मर्मत गरी फेर्ने",
            optionD = "माथिका सबै",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "नम्बर प्लेटमा '१४ झ' संकेत भएको सवारीले कस्तो सवारीलाई जनाउँछ?",
            optionA = "निजी कार",
            optionB = "ट्याक्सी",
            optionC = "टेम्पो",
            optionD = "संस्थानको जिप",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "दुई वा दुईभन्दा बढी व्यक्तिको नाममा सवारी दर्ता गर्नुलाई के भनिन्छ?",
            optionA = "सवारी दर्ता",
            optionB = "संयुक्त सवारी दर्ता",
            optionC = "सवारी किन बेच",
            optionD = "सवारी स्वामित्व",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "ब्लु बुकको रङ कस्तो हुन्छ?",
            optionA = "कालो",
            optionB = "रातो",
            optionC = "निलो",
            optionD = "पहेंलो",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "आपतकालीन सवारी कुन कुन हुन्?",
            optionA = "दमकल",
            optionB = "एम्बुलेन्स",
            optionC = "शववाहन",
            optionD = "माथिका सबै",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "आगो निभाउन प्रयोग गरिने सवारी कुन हो?",
            optionA = "दमकल",
            optionB = "एम्बुलेन्स",
            optionC = "सववाहन",
            optionD = "ट्याक्सी",
            correctOptionIndex = 0
        ),
        Question(
            questionText = "कस्तो रङ छुट्याउन नसकेर दृष्टि दोष भएकाले चालक अनुमति पत्र प्राप्त गर्न सक्दैन?",
            optionA = "रातो",
            optionB = "सेतो",
            optionC = "कालो",
            optionD = "निलो",
            correctOptionIndex = 0
        ),
        Question(
            questionText = "इम्बोस्ड नम्बर प्लेट भनेको के हो?",
            optionA = "प्लेटमा इनामेलले लेखिएको नम्बर प्लेट",
            optionB = "प्लेटमा खाल्डो पारि लेखिएको नम्बर प्लेट",
            optionC = "प्लेटमा उठाएर लेखिएको नम्बर प्लेट",
            optionD = "माथिका सबै",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "प्राथमिक उपचार भन्नाले के बुझिन्छ?",
            optionA = "हतपत उठाएर अस्पताल लैजाने",
            optionB = "सामान्य चोटपटक लागेमा टाँसमा मलमपट्टी गर्ने",
            optionC = "डक्टर नभएको भए डक्टर बोलाउने",
            optionD = "माथिका सबै",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "नेपालमा सबैभन्दा बढी दर्ता भएको सवारी साधन कुन हो?",
            optionA = "कार",
            optionB = "बस",
            optionC = "मोटरसाइकल",
            optionD = "ई-रिक्सा",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "तलकामध्ये कुन सवारी दर्ता गराउन पर्दैन?",
            optionA = "इलेक्ट्रिक साइकल",
            optionB = "पाइडल भएको इलेक्ट्रिक साइकल",
            optionC = "इलेक्ट्रिक स्कूटर",
            optionD = "इलेक्ट्रिक मोटरसाइकल",
            correctOptionIndex = 0
        ),
        Question(
            questionText = "स्वेच्छाले आफ्नो सवारीको रङ परिवर्तन गर्दा के हुन्छ?",
            optionA = "राम्रो हुन्छ",
            optionB = "सवारी सफा देखिन्छ",
            optionC = "फजुल खर्च बढ्छ",
            optionD = "जरिवाना हुन्छ",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "बिरामीलाई अस्पतालसम्म लैजाने सवारी कुन हो?",
            optionA = "दमकल",
            optionB = "एम्बुलेन्स",
            optionC = "शववाहन",
            optionD = "ट्याक्सी",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "हरियो नम्बर प्लेट भएको सवारीले कस्तो सवारीलाई जनाउँछ?",
            optionA = "निजी सवारी",
            optionB = "सरकारी सवारी",
            optionC = "संस्थान सवारी",
            optionD = "पर्यटक सवारी",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "सवारी चालक अनुमति पत्र किन आवश्यक छ?",
            optionA = "सवारी साधन चलाउन",
            optionB = "सवारी खरिद गर्न",
            optionC = "सवारी साधन बेच बिक्रि गर्न",
            optionD = "कुनै पनि होइन",
            correctOptionIndex = 0
        ),
        Question(
            questionText = "सवारी दर्ता प्रमाणपत्र भनेको के हो?",
            optionA = "सवारीको सम्पूर्ण विवरण लेखिएको प्रमाणपत्र",
            optionB = "सवारी चलाउने इजाजत",
            optionC = "सवारी कुदाउन पाउने विवरण लेखिएको प्रमाणपत्र",
            optionD = "कुनै पनि होइन",
            correctOptionIndex = 0
        ),
        Question(
            questionText = "कस्तो सवारीको नम्बर प्लेट कालो हुन्छ?",
            optionA = "सरकारी सवारी साधन",
            optionB = "सार्वजनिक सवारी साधन",
            optionC = "संस्थानको सवारी साधन",
            optionD = "पर्यटक सवारी साधन",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "सवारी चालक अनुमति पत्र हराएमा के के कागजात सहित निवेदन दिनु पर्छ?",
            optionA = "ट्राफिकको सिफारिस सहित निवेदन र दस्तुर",
            optionB = "वडा कार्यालयको सिफारिस",
            optionC = "जिल्ला प्रशासन कार्यालयको सिफारिस",
            optionD = "माथिका सबै",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "तलकामध्ये कुन अवस्थामा सवारी चालक अनुमति पत्र प्राप्त गर्न सकिँदैन?",
            optionA = "दृष्टिहीन भएको",
            optionB = "तत्खो भएको",
            optionC = "हातखुट्टा कमजोर भएको",
            optionD = "माथिका सबै",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "सवारी चालक अनुमति पत्र नवीकरण कुन कार्यालयले गर्दैन?",
            optionA = "ट्राफिक प्रहरी कार्यालय",
            optionB = "सवारी परीक्षण कार्यालय",
            optionC = "यातायात व्यवस्था विभाग",
            optionD = "माथिका सबै",
            correctOptionIndex = 0
        ),
        Question(
            questionText = "सार्वजनिक सवारीलाई सडकमा चल्ने अनुमति दिइ अग्रि दिने जाँचपासको प्रमाण पत्र कसले जारी गर्छ?",
            optionA = "जिल्ला प्रशासन कार्यालय",
            optionB = "ट्राफिक प्रहरी कार्यालय",
            optionC = "यातायात व्यवस्था कार्यालय",
            optionD = "माझिका सबै",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "बाटो ईजाजत पत्र नभई कुन सवारी चलाउन पाइँदैन?",
            optionA = "निजी सवारी साधन",
            optionB = "सरकारी सवारी साधन",
            optionC = "सार्वजनिक सवारी साधन",
            optionD = "कूटनीतिक सवारी साधन",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "सवारीको लागि निर्धारित गति फेरबदल गर्न सक्ने अधिकार कसको हुन्छ?",
            optionA = "ट्राफिक प्रहरी कार्यालय",
            optionB = "यातायात व्यवस्था कार्यालय",
            optionC = "यातायात व्यवस्था विभाग",
            optionD = "माझिका सबै",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "विदेशले सवारी चलाउनु भन्दा पहिले के गर्नु पर्छ?",
            optionA = "मर्मत गर्नु पर्छ",
            optionB = "इजाजत लिनु पर्छ",
            optionC = "केही पनि गर्न पर्दैन",
            optionD = "प्रहरीलाई देखाउनुपर्छ",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "यातायात व्यवस्थापन समितिको अध्यक्ष को हुन्छ?",
            optionA = "यातायात व्यवस्था कार्यालयको प्रमुख",
            optionB = "जिल्ला प्रहरी प्रमुख",
            optionC = "ट्राफिक कार्यालयको प्रमुख",
            optionD = "कुनै पनि होइन",
            correctOptionIndex = 0
        ),
        Question(
            questionText = "तीन लेनको सडकमा गाडी चलाउँदा कसरी चलाउन पर्छ?",
            optionA = "दुईतर्फी",
            optionB = "तीन तर्फी",
            optionC = "एकतर्फी",
            optionD = "कुनै पनि होइन",
            correctOptionIndex = 0
        ),
        Question(
            questionText = "तपाईंले आफ्नो चार पाङ्ग्रे सवारी साधन स्टार्ट गर्दा कसरी गर्नु पर्छ?",
            optionA = "गियर चेक गरे",
            optionB = "ब्रेक लगाए",
            optionC = "तेल चेक गरे",
            optionD = "इन्जिन चेक गरे",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "सानो सवारी र ठूलो सवारीमा कुनले पहिले साइड दिनु पर्छ?",
            optionA = "मध्य आउँको सवारीले",
            optionB = "सानो सवारीले",
            optionC = "ठूलो सवारीले",
            optionD = "माझिका सबै",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "गियर किन परिवर्तन गर्नुपर्छ?",
            optionA = "स्पीड बढाउन",
            optionB = "स्पीड घटाउन",
            optionC = "हर्ने बजाउन",
            optionD = "क र ख दुवै",
            correctOptionIndex = 3
        ),
        Question(
            questionText = "सवारी चालक अनुमति पत्रको प्रतिलिपि कुन अवस्थामा प्राप्त गर्न सकिँदैन?",
            optionA = "सवारी चालक अनुमति पत्र हराएमा",
            optionB = "च्यातिएमा",
            optionC = "नविकरण नभई झिक्नुपर्ने",
            optionD = "पहिला लिएको साधमा भएमा",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "गाडी स्टार्ट गरी अगाडि बढाउँदा कुन सिग्नल दिएर अगाडि बढाउनु पर्छ?",
            optionA = "हेड लाइट बालेर",
            optionB = "दायाँतर्फको साइड लाइट बालेर",
            optionC = "बायाँतर्फको साइड लाइट बालेर",
            optionD = "इमरजेन्सी लाइट बालेर",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "कस्तो ठाउँमा सवारीको गति कम गर्नु पर्छ?",
            optionA = "विद्यालय क्षेत्रमा",
            optionB = "चौबाटोमा",
            optionC = "बालको बस्ती भएको ठाउँमा",
            optionD = "माथिका सबै",
            correctOptionIndex = 4
        ),
        Question(
            questionText = "हेभी इक्विपमेन्टमा तल्कामध्ये कुन पर्दैन?",
            optionA = "डोजर",
            optionB = "मिनिभस",
            optionC = "लोडर",
            optionD = "मोबाइल क्रेन",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "नेपालमा सर्वप्रथम कहिले सवारी साधन भित्रिएको हो?",
            optionA = "वि.स. १९६६",
            optionB = "वि.स. २०२१",
            optionC = "वि.स. २०००",
            optionD = "वि.स. २०४९",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "फगलाईट कस्तो रङको हुन्छ?",
            optionA = "रातो",
            optionB = "पहेंलो",
            optionC = "हरियो",
            optionD = "निलो",
            correctOptionIndex = 2
        ),
        Question(
            questionText = "एम्बुलेन्सको अगाडि एम्बुलेन्स भनी अंग्रेजी अक्षरमा किन उल्टो लेखिएको हुन्छ?",
            optionA = "अगाडिको गाडीले लुकिङ ग्लासमा स्पष्टै पढ्न सकोस् भनी",
            optionB = "चल्ने त्यस्तै छ त्यस्तैले",
            optionC = "असभ्यता फरक देखाउन",
            optionD = "माथिका कुनै पनि होइनन्",
            correctOptionIndex = 1
        ),
        Question(
            questionText = "निलो नम्बर प्लेट भएका सवारीले कस्तो सवारीलाई बुझाउँछ?",
            optionA = "कूटनीतिक",
            optionB = "सरकारी",
            optionC = "निजी",
            optionD = "संस्थान",
            correctOptionIndex = 1
        ),

        //upto qn 84


    )
}
