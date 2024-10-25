package com.example.a30daysapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = TipAdapter(createTips())
    }

    private fun createTips(): List<Tip> {
        return listOf(
            Tip(1, "Spend 5-10 minutes on warm-ups like humming, lip trills, and sirens to wake up your vocal cords.", R.drawable.day1),
            Tip(2, "Focus on breathing from your diaphragm. Inhale deeply through your nose, letting your belly expand, and exhale slowly.", R.drawable.day2),
            Tip(3, "Drink plenty of water throughout the day. Avoid caffeine and alcohol, which can dry out your vocal cords.", R.drawable.day3),
            Tip(4, "Sing scales from low to high notes, noting where your comfortable range lies. This helps you understand your vocal limits.", R.drawable.day4),
            Tip(5, "Stand straight with relaxed shoulders. Good posture allows for better breath support and sound projection.", R.drawable.day5),
            Tip(6, "Sing a song and record it. Listen back to identify areas that need improvement, like pitch, timing, or tone.", R.drawable.day6),
            Tip(7, "Experiment with chest voice (lower range) and head voice (higher range) to understand how they sound and feel.", R.drawable.day7),
            Tip(8, "Do lip trills for 5 minutes to practice smooth vocal transitions and improve breath control.", R.drawable.day8),
            Tip(9, "Practice singing softly without losing pitch accuracy. This helps you gain better vocal control.", R.drawable.day9),
            Tip(10, "Sing through a song slowly, focusing on pronouncing each word clearly. Good enunciation enhances your singing.", R.drawable.day10),
            Tip(11, "Try sustained notes while engaging your diaphragm, gradually extending how long you can hold the note.", R.drawable.day11),
            Tip(12, "Sing with a metronome to improve your sense of rhythm and timing.", R.drawable.day12),
            Tip(13, "Practice using your diaphragm to sing louder without straining. Take a deep breath and project your sound.", R.drawable.day13),
            Tip(14, "Gradually extend your range by singing a half step higher or lower than your comfort zone, but don’t force it.", R.drawable.day14),
            Tip(15, "Sing scales and arpeggios to improve pitch accuracy, vocal agility, and control.", R.drawable.day15),
            Tip(16, "Sing a song and think about where to breathe and how to shape each phrase for emotional expression.", R.drawable.day16),
            Tip(17, "Try to sing with a slight wavering pitch to create vibrato. Practice controlling it to make it sound natural.", R.drawable.day17),
            Tip(18, "Experiment with varying your volume—start a note softly, gradually increase, and then fade out.", R.drawable.day18),
            Tip(19, "Practice exercises like NG sounds to strengthen your head voice and smooth out transitions.", R.drawable.day19),
            Tip(20, "Practice melisma (singing multiple notes on a single syllable) to improve vocal agility.", R.drawable.day20),
            Tip(21, "Experiment with different genres to build versatility and develop your unique style.", R.drawable.day21),
            Tip(22, "After a practice session, gently hum or do soft scales to relax your vocal cords.", R.drawable.day21),
            Tip(23, "Watch your posture, facial expressions, and mouth movements as you sing to correct any issues.", R.drawable.day23),
            Tip(24, "Rest your voice if it feels tired, and don’t push beyond your limits.", R.drawable.day24),
            Tip(25, "Adjusting your tongue’s position can affect your tone. Practice singing vowels and notice the differences.", R.drawable.day25),
            Tip(26, "Hold notes for longer periods to practice consistent pitch and steady breath support.", R.drawable.day26),
            Tip(27, "Play random notes on a piano and try to match them. This improves your ear and pitch accuracy.", R.drawable.day27),
            Tip(28, "Consider joining a choir or singing group to practice harmonizing and improve listening skills.", R.drawable.day28),
            Tip(29, "Try singing tongue twisters to make your enunciation clearer.", R.drawable.day29),
            Tip(30, "Listen to recordings from Day 1 and compare them to now. Reflect on your progress and plan the next steps in your vocal journey.", R.drawable.day30),
            )
    }
}

