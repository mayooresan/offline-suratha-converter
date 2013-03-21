package com.example.suratha_converter;

public class TamToUni {
	
	
	public static String ConvertTam(String TextData) {
		
	   	
		/*
		String Show = "n"+"\\"+"s";
		String ShO = "N"+"\\"+"h";
		String Sho = "n"+"\\"+"h";
		String ShA = "\\"+"h";
		String Shi = "\\"+"p";
		String ShI = "\\"+"P";
		String She = "n"+"\\";
		String ShE = "N"+"\\";
		String Shai = "i"+"\\";
		String Sh = "\\"+";";
		String Sha = "\\";
		
		String ShaText[] = {Show,  ShO,  Sho,  ShA,  Shi,  ShI, She,  ShE,  Shai,  Sh,  Sha};

		String ShaReplace[] = {"ஷௌ",  "ஷோ",  "ஷொ",  "ஷா",  "ஷி",  "ஷீ", "ஷெ",  "ஷே", "ஷை",  "ஷ்",  "ஷ"};
		
		*/
		
		String TamilText[] = {"þ", "þ£", "¬þ", "V", "r", "þ§", "þ¨", "ªþ", "«þ", "ªþ£",
				"«þ£", "ªþ÷", "z", "ªü÷", "«ü£", "ªü£", "ü£", "T", "p", "ü§",
				"ü¨", "ªü", "«ü", "¬ü", "ªü£", "x", "ü", "ªè÷", "«è£", "ªè£",
				"è£", "A", "W", "°", "Ã", "ªè", "«è", "¬è", "‚", "è",
				"ªé÷", "«é£", "ªé£", "é£", "B", "X", "±", "Ä", "ªé", "«é",
				"¬é", "ƒ", "é", "ªê÷", "«ê£", "ªê£", "ê£", "C", "Y", "²",
				"Å", "ªê", "«ê", "¬ê", "„", "ê", "ªë÷", "«ë£", "ªë£", "ë£",
				"D", "Z", "³", "Æ", "ªë", "«ë", "¬ë", "…", "ë", "ªì÷",
				"«ì£", "ªì£", "ì£", "®", "¯", "´", "Ç", "ªì", "«ì", "¬ì",
				"†", "ì", "ªí÷", "«í£", "ªí£", "í£", "E", "a", "µ", "È",
				"ªí", "«í", "¬í", "‡", "í", "ªî÷", "«î£", "ªî£", "î£", "F",
				"b", "¶", "É", "ªî", "«î", "¬î", "ˆ", "î", "ªï÷", "«ï£",
				"ªï£", "ï£", "G", "c", "¸", "Ë", "ªï", "«ï", "¬ï", "ªï£",
				"‰", "ï", "ªù÷", "«ù£", "ªù£", "ù£", "Q", "m", "Â", "Û",
				"ªù", "«ù", "¬ù", "ªù£", "¡", "ù", "ªð÷", "«ð£", "ªð£", "ð£",
				"H", "d", "¹", "Ì", "ªð", "«ð", "¬ð", "ªð£", "Š", "ð",
				"ªñ÷", "«ñ£", "ªñ£", "ñ£", "I", "e", "º", "Í", "ªñ", "«ñ",
				"¬ñ", "ªñ£", "‹", "ñ", "ªò÷", "«ò£", "ªò£", "ò£", "J", "f",
				"»", "Î", "ªò", "«ò", "¬ò", "ªò£", "Œ", "ò", "ªó÷", "«ó£",
				"ªó£", "ó£", "K", "g", "¼", "Ï", "ªó", "«ó", "¬ó", "˜",
				"ó", "ªô÷", "«ô£", "ªô£", "ô£", "L", "h", "½", "Ö", "ªô",
				"«ô", "¬ô", "™", "ô", "ª÷÷", "«÷£", "ª÷£", "÷£", "O", "k",
				"À", "Ù", "ª÷", "«÷", "¬÷", "œ", "÷", "ªõ÷", "«õ£", "ªõ£",
				"õ£", "M", "i", "¾", "×", "ªõ", "«õ", "¬õ", "ªõ£", "š",
				"õ", "ªö÷", "«ö£", "ªö£", "ö£", "N", "j", "¿", "Ø", "ªö",
				"«ö", "¬ö", "›", "ö", "ªø÷", "«ø£", "ªø£", "ø£", "P", "l",
				"Á", "Ú", "ªø", "«ø", "¬ø", "ªø£", "Ÿ", "ø", "ªý÷", "«ý£",
				"ªý£", "ý£", "U", "q", "ªý", "«ý", "¬ý", "y", "ý", "ªû÷",
				"«û£", "ªû£", "û£", "S", "o", "ªû", "«û", "¬û", "ªû£", "w",
				"û", "ªú÷", "«ú£", "ªú£", "ú£", "R", "n", "ªú", "«ú", "¬ú",
				"v", "ú", "Ü", "Ý", "Þ", "ß", "à", "á", "â", "ã",
				"ä", "å", "æ", "å÷", "ç", "ÿ", "ƒ"};

		String TamilReplace[] = {"க்ஷ", "க்ஷா", "க்ஷை", "க்ஷி", "க்ஷீ", "க்ஷு", "க்ஷூ", "க்ஷெ", "க்ஷே", "க்ஷொ",
				"க்ஷோ", "க்ஷௌ", "க்ஷ்", "ஜௌ", "ஜோ", "ஜொ", "ஜா", "ஜி", "ஜீ", "ஜு",
				"ஜூ", "ஜெ", "ஜே", "ஜை", "ஜொ", "ஜ்", "ஜ", "கௌ", "கோ", "கொ",
				"கா", "கி", "கீ", "கு", "கூ", "கெ", "கே", "கை", "க்", "க",
				"ஙௌ", "ஙோ", "ஙொ", "ஙா", "ஙி", "ஙீ", "ஙு", "ஙூ", "ஙெ", "ஙே",
				"ஙை", "ங்", "ங", "சௌ", "சோ", "சொ", "சா", "சி", "சீ", "சு",
				"சூ", "செ", "சே", "சை", "ச்", "ச", "ஞௌ", "ஞோ", "ஞொ", "ஞா",
				"ஞி", "ஞீ", "ஞு", "ஞூ", "ஞெ", "ஞே", "ஞை", "ஞ்", "ஞ", "டௌ",
				"டோ", "டொ", "டா", "டி", "டீ", "டு", "டூ", "டெ", "டே", "டை",
				"ட்", "ட", "ணௌ", "ணோ", "ணொ", "ணா", "ணி", "ணீ", "ணு", "ணூ",
				"ணெ", "ணே", "ணை", "ண்", "ண", "தௌ", "தோ", "தொ", "தா", "தி",
				"தீ", "து", "தூ", "தெ", "தே", "தை", "த்", "த", "நௌ", "நோ",
				"நொ", "நா", "நி", "நீ", "நு", "நூ", "நெ", "நே", "நை", "நொ",
				"ந்", "ந", "னௌ", "னோ", "னொ", "னா", "னி", "னீ", "னு", "னூ",
				"னெ", "னே", "னை", "னொ", "ன்", "ன", "பௌ", "போ", "பொ", "பா",
				"பி", "பீ", "பு", "பூ", "பெ", "பே", "பை", "பொ", "ப்", "ப",
				"மௌ", "மோ", "மொ", "மா", "மி", "மீ", "மு", "மூ", "மெ", "மே",
				"மை", "மொ", "ம்", "ம", "யௌ", "யோ", "ய", "யா", "யி", "யீ",
				"யு", "யூ", "யெ", "யே", "யை", "யொ", "ய்", "ய", "ரௌ", "ரோ",
				"ரொ", "ரா", "ரி", "ரீ", "ரு", "ரூ", "ரெ", "ரே", "ரை", "ர்",
				"ர", "லௌ", "லோ", "லொ", "லா", "லி", "லீ", "லு", "லூ", "லெ",
				"லே", "லை", "ல்", "ல", "ளௌ", "ளோ", "ள", "ளா", "ளி", "ளீ",
				"ளு", "ளூ", "ளெ", "ளே", "ளை", "ள்", "ள", "வௌ", "வோ", "வொ",
				"வா", "வி", "வீ", "வு", "வூ", "வெ", "வே", "வை", "வொ", "வ்",
				"வ", "ழௌ", "ழோ", "ழொ", "ழா", "ழி", "ழீ", "ழு", "ழூ", "ழெ",
				"ழே", "ழை", "ழ்", "ழ", "றௌ", "றோ", "றொ", "றா", "றி", "றீ",
				"று", "றூ", "றெ", "றே", "றை", "றொ", "ற்", "ற", "ஹௌ", "ஹோ",
				"ஹொ", "ஹா", "ஹி", "ஹீ", "ஹெ", "ஹே", "ஹை", "ஹ்", "ஹ", "ஷௌ",
				"ஷோ", "ஷொ", "ஷா", "ஷி", "ஷீ", "ஷெ", "ஷே", "ஷை", "ஷொ", "ஷ்",
				"ஷ", "ஸௌ", "ஸோ", "ஸொ", "ஸா", "ஸி", "ஸீ", "ஸெ", "ஸே", "ஸை",
				"ஸ்", "ஸ", "அ", "ஆ", "இ", "ஈ", "உ", "ஊ", "எ", "ஏ",
				"ஐ", "ஒ", "ஓ", "ஔ", "ஃ", "ஸ்ரீ", "‘"};



		String ResultText = TextData.replaceAll(TamilText[0], TamilReplace[0]);

		int count = 0;

		while (count < TamilText.length) {

			ResultText = ResultText.replaceAll(TamilText[count],
					TamilReplace[count]);

			count++;
		}

		return ResultText;
		
	}
		
}
