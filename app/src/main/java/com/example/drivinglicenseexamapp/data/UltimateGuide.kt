package com.example.drivinglicenseexamapp.data

data class Phase(val title: String, val subtitle: String, val steps: List<Pair<String, List<String>?>>)

val phases = listOf(
    Phase(
        "Phase I", "Online Form", listOf(
            "1. Visit the official site:" to listOf(
                "For Bagmati and Pokhara: applydlnew.dotm.gov.np",
                "For other regions: applydl.dotm.gov.np"
            ),
            "2. Fill the form carefully with the mobile number registered in your name. Double-check all details to ensure there are no errors." to null,
            "3. Choose the Transport Office where you want to visit." to null,
            "4. Select a visit date that fits your schedule." to null
        )
    ),
    Phase(
        "Phase II", "Office Visit", listOf(
            "1. What you need for the office visit:" to listOf(
                "Application form",
                "Original citizenship (ALWAYS carry original citizenship when visiting any Government Office)",
                "Medical report confirming blood group (get it from your nearest hospital as it'll cost you less money)"
            ),
            "2. What you DON'T need:" to listOf(
                "Ticket (save Rs. 10)",
                "Expensive blood group ID (better to get a report from a local medical center or hospital)"
            ),
            "3. Process:" to listOf(
                "Biometric: Palm print and photo will be taken.",
                "Eye Check: Pay Rs. 105 and pass the E-test.",
                "Final Stage: Pay Rs. 500 for written test and trial."
            )
        )
    ),
    Phase(
        "Phase III", "Written Test", listOf(
            "1. Exam Details:" to listOf(
                "Languages: Nepali or English.",
                "Use practice apps to prepare as the exam is simple."
            ),
            "2. If you fail:" to listOf(
                "Wait 90 days before reapplying.",
                "You must retake the written exam."
            )
        )
    ),
    Phase(
        "Phase IV", "Trial", listOf(
            "1. Checklist for Trial Day:" to listOf(
                "Admit card (signed)",
                "Original citizenship",
                "Wear shoes (no slippers allowed)"
            ),
            "2. Key Tips:" to listOf(
                "Ukalo-Oralo: Stop above the STOP word without crossing it.",
                "Avoid common mistakes like forgetting the sidelight or double-tapping the incline."
            ),
            "3. If you pass:" to listOf(
                "Visit the Transport Office the day after tomorrow (पर्सि).",
                "Pay Rs. 1500 and collect two receipts (Green and Red).",
                "Laminate the green receipt and keep the red one safe."
            ),
            "4. If you fail:" to listOf(
                "You have two more attempts.",
                "For retrial, visit on the 3rd day after failing and pay Rs. 500.",
                "If you fail all 3 attempts, restart the process (biometrics not needed, eye check required)."
            )
        )
    )
)