<%@ page contentType="text/html; charset=UTF-8" %>
    <html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Kyselylomake</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <link rel="stylesheet" type="text/css" href="resources/styles/form.css">
    </head>

    <body>
        <div class="query-explanation">
            <h1>Kysely</h1>
        </div>
        <form id="rendered-form">
            <div class="rendered-form">
                <div class="fb-select form-group field-opintojen-aloitusvuosi">
                    <label for="opintojen-aloitusvuosi" class="fb-select-label">Opintojen aloitusvuosi
                        <span class="fb-required">*</span>
                    </label>
                    <select class="form-control" name="opintojen-aloitusvuosi" id="opintojen-aloitusvuosi" required="required" aria-required="true">
                        <option value="option-1" selected="true" id="opintojen-aloitusvuosi-0">2017</option>
                        <option value="option-2" id="opintojen-aloitusvuosi-1">2016</option>
                        <option value="option-3" id="opintojen-aloitusvuosi-2">2015</option>
                        <option value="option-4" id="opintojen-aloitusvuosi-3">2014</option>
                        <option value="option-5" id="opintojen-aloitusvuosi-4">2013 tai aiemmin</option>
                    </select>
                </div>
                <div class="fb-select form-group field-koulutuslinja">
                    <label for="koulutuslinja" class="fb-select-label">Kampus
                        <span class="fb-required">*</span>
                    </label>
                    <select class="form-control" name="koulutuslinja" id="koulutuslinja" required="required" aria-required="true">
                        <option value="option-1" selected="true" id="koulutuslinja-0">Pasila</option>
                        <option value="option-2" id="koulutuslinja-1">Haaga</option>
                        <option value="option-3" id="koulutuslinja-2">Malmi</option>
                        <option value="option-4" id="koulutuslinja-3">Porvoo</option>
                        <option value="option-5" id="koulutuslinja-4">Vierumäki</option>
                    </select>
                </div>
                <div class="fb-select form-group field-tutkinto">
                    <label for="tutkinto" class="fb-select-label">Tutkinto
                        <span class="fb-required">*</span>
                    </label>
                    <select class="form-control" name="tutkinto" id="tutkinto" required="required" aria-required="true">
                        <option value="option-1" selected="true" id="tutkinto-0">Tradenomi</option>
                        <option value="option-2" id="tutkinto-1">Restonomi</option>
                        <option value="option-3" id="tutkinto-2">Medianomi</option>
                        <option value="option-4" id="tutkinto-3">Liikunnanohjaaja</option>
                    </select>
                </div>
                <br>
                <div class="fb-radio-group form-group field-kytk-opiskelijatapahtumissa">
                    <label for="kytk-opiskelijatapahtumissa" id="fb-radio-group-label">
                        <span style="text-indent: -18pt;">Käytkö opiskelijatapahtumissa?</span>
                        <span class="fb-required">*</span>
                    </label>
                    <div class="radio-group">
                        <div class="radio">
                            <input name="kytk-opiskelijatapahtumissa" id="kytk-opiskelijatapahtumissa-0" required="required" aria-required="true" value="option-1"
                                type="radio">
                            <label for="kytk-opiskelijatapahtumissa-0">Kyllä</label>
                        </div>
                        <div class="radio">
                            <input name="kytk-opiskelijatapahtumissa" id="kytk-opiskelijatapahtumissa-1" required="required" aria-required="true" value="option-2"
                                type="radio">
                            <label for="kytk-opiskelijatapahtumissa-1">Ei</label>
                        </div>
                    </div>
                    <br>
                </div>
                <div class="fb-radio-group form-group field-jos-vastasit-ei">
                    <label for="jos-vastasit-ei" class="fb-radio-group-label">
                        <span class="MsoListParagraph">Jos vastasit
                            <b>ei</b>, olisitko kiinnostunut osallistumaan, jos tarjolla olisi monipuolisempaa vapaa-ajan toimintaa?
                        </span>
                        <span class="fb-required">*</span>
                    </label>
                    <div class="radio-group">
                        <div class="radio">
                            <input name="jos-vastasit-ei" id="jos-vastasit-ei-0" required="required" aria-required="true" value="option-1" type="radio">
                            <label for="jos-vastasit-ei-0">Kyllä</label>
                        </div>
                        <div class="radio">
                            <input name="jos-vastasit-ei" id="jos-vastasit-ei-1" required="required" aria-required="true" value="option-2" type="radio">
                            <label for="jos-vastasit-ei-1">Ei</label>
                        </div>
                    </div>
                    <br>
                </div>
                <div class="fb-checkbox-group form-group field--millaisesta-toiminnasta">
                    <label for="-millaisesta-toiminnasta" class="fb-checkbox-group-label">
                        <span class="MsoListParagraph">Millaisesta toiminnasta olet kiinnostunut?
                        </span>
                        <span class="fb-required">*</span>
                    </label>
                    <div class="checkbox-group">
                        <div class="checkbox">
                            <input name="millaisesta" id="millaisesta-toiminnasta-0" required="required" aria-required="true" value="option-1" type="checkbox">
                            <label for="millaisesta-toiminnasta-0">Musiikki</label>
                        </div>
                        <div class="checkbox">
                            <input name="millaisesta" id="millaisesta-toiminnasta--1" required="required" aria-required="true" value="option-2" type="checkbox">
                            <label for="millaisesta-toiminnasta-1">Teatteri</label>
                        </div>
                        <div class="checkbox">
                            <input name="millaisesta" id="millaisesta-toiminnasta--2" required="required" aria-required="true" value="option-3" type="checkbox">
                            <label for="millaisesta-toiminnasta-2">Näyttelyt</label>
                        </div>
                        <div class="checkbox">
                            <input name="millaisesta" id="millaisesta-toiminnasta--3" required="required" aria-required="true" value="option-4" type="checkbox">
                            <label for="millaisesta-toiminnasta-3">Lenkkeily</label>
                        </div>
                        <div class="checkbox">
                            <input name="millaisesta" id="millaisesta-toiminnasta--4" required="required" aria-required="true" value="option-5" type="checkbox">
                            <label for="millaisesta-toiminnasta-4">Pallopelit</label>
                        </div>
                        <div class="checkbox">
                            <input name="millaisesta" id="millaisesta-toiminnasta--5" required="required" aria-required="true" value="option-6" type="checkbox">
                            <label for="millaisesta-toiminnasta-5">Ryhmäliikunta</label>
                        </div>
                        <div class="checkbox">
                            <input name="millaisesta" id="millaisesta-toiminnasta--6" required="required" aria-required="true" value="option-7" type="checkbox">
                            <label for="millaisesta-toiminnasta-6">Ruoka -ja viini-tapahtumat</label>
                        </div>
                        <div class="checkbox">
                            <input name="millaisesta" id="millaisesta-toiminnasta--7" required="required" aria-required="true" value="option-8" type="checkbox">
                            <label for="millaisesta-toiminnasta-7">Lautapeli-illat</label>
                        </div>
                        <div class="checkbox">
                            <input name="millaisesta" id="millaisesta-toiminnasta--8" required="required" aria-required="true" value="option-9" type="checkbox">
                            <label for="millaisesta-toiminnasta-8">Videopeli-illat</label>
                        </div>
                        <div class="checkbox">
                            <input name="millaisesta" id="millaisesta-toiminnasta--Muu, mikä?" required="required" aria-required="true" class="undefined Muu, mikä?-option"
                                value="" type="checkbox">
                            <label for="millaisesta-toiminnasta-Muu, mikä?">Muu, mikä?
                                <input type="text" id="-millaisesta-toiminnasta-Muu, mikä?-value" class="Muu, mikä?-val" required="required">
                            </label>
                        </div>
                    </div>
                    <br>
                </div>
                <div id="fb-checkbox-group form-group field-kuinka-paljon">
                    <label for="kuinka-paljon" id="fb-checkbox-group-label">Kuinka paljon olisit valmis käyttämään rahaa vapaa-ajan toimintaan per kerta?</span>
                        <span class="fb-required">*</span>
                    </label>
                    <div class="checkbox-group">
                        <div class="checkbox">
                            <input name="kuinka-paljon[]" id="kuinka-paljon-0" required="required" aria-required="true" value="option-1" type="checkbox">
                            <label for="kuinka-paljon-0">En ollenkaan</label>
                        </div>
                        <div class="checkbox">
                            <input name="kuinka-paljon[]" id="kuinka-paljon-1" required="required" aria-required="true" value="option-2" type="checkbox">
                            <label for="kuinka-paljon-1">Alle 5 €</label>
                        </div>
                        <div class="checkbox">
                            <input name="kuinka-paljon[]" id="kuinka-paljon-2" required="required" aria-required="true" value="option-3" type="checkbox">
                            <label for="kuinka-paljon-2">5 - 10 €</label>
                        </div>
                        <div class="checkbox">
                            <input name="kuinka-paljon[]" id="kuinka-paljon-3" required="required" aria-required="true" value="option-4" type="checkbox">
                            <label for="kuinka-paljon-3">10 - 15 €</label>
                        </div>
                        <div class="checkbox">
                            <input name="kuinka-paljon[]" id="kuinka-paljon-4" required="required" aria-required="true" value="option-5" type="checkbox">
                            <label for="kuinka-paljon-4">15 - 20 €</label>
                        </div>
                        <div class="checkbox">
                            <input name="kuinka-paljon[]" id="kuinka-paljon-5" required="required" aria-required="true" value="option-6" type="checkbox">
                            <label for="kuinka-paljon-5">20 - 30 €</label>
                        </div>
                        <div class="checkbox">
                            <input name="kuinka-paljon[]" id="kuinka-paljon-6" required="required" aria-required="true" value="option-7" type="checkbox">
                            <label for="kuinka-paljon-6">30 € tai enemmän</label>
                        </div>
                    </div>
                    <br>
                </div>

                <div class="fb-checkbox-group form-group field-valitse-kanavat">
                    <label for="valitse-kanavat" id="fb-checkbox-group-label">
                        <span>Valitse seuraavat kanavat, joista seuraat tietoa koulun tapahtumista
                        </span>
                        <span class="fb-required">*</span>
                    </label>
                    <div class="checkbox-group">
                        <div class="checkbox">
                            <input name="valitse-kanavat" id="valitse-kanavat-0" required="required" aria-required="true" value="option-1" type="checkbox">
                            <label for="valitse-kanavat-0">Helgan sivut</label>
                        </div>
                        <div class="checkbox">
                            <input name="valitse-kanavat" id="valitse-kanavat-1" required="required" aria-required="true" value="option-2" type="checkbox">
                            <label for="valitse-kanavat-1">Facebook</label>
                        </div>
                        <div class="checkbox">
                            <input name="valitse-kanavat" id="valitse-kanavat-2" required="required" aria-required="true" value="option-3" type="checkbox">
                            <label for="valitse-kanavat-2">Kavereiden/tutorien kautta</label>
                        </div>
                        <div class="checkbox">
                            <input name="valitse-kanavat" id="valitse-kanavat-3" required="required" aria-required="true" value="option-4" type="checkbox">
                            <label for="valitse-kanavat-3">Koulun fyysiset ilmoitukset</label>
                        </div>
                        <div class="checkbox">
                            <input name="valitse-kanavat" id="valitse-kanavat-Muu, mikä?" required="required" aria-required="true" class="undefined Muu, mikä?-option"
                                value="" type="checkbox">
                            <label for="valitse-kanavat-Muu, mikä?">Muu, mikä?
                                <input type="text" id="valitse-kanavat-Muu, mikä?-value" class="Muu, mikä?-val" required="required">
                            </label>
                        </div>
                    </div>
                </div>
            </div>
            <br>
            <button id=tallennus>Tallenna</button>
            <button id=tyhjennys>Tyhjennä vastaukset</button>
        </form>
    </body>
    <script>
    
    </script>
  </html>