package com.example.myapplication_rank
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class RankingActivity : AppCompatActivity() {

    private lateinit var rankingRecyclerView: RecyclerView
    private lateinit var rankingAdapter: RankingAdapter
    private lateinit var rankingList: MutableList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ranking)

        rankingRecyclerView = findViewById(R.id.rankingRecyclerView)

        // 랭킹 데이터 초기화
        rankingList = createDummyRankingList().sortedByDescending { it.balance }.toMutableList()

        // 리사이클러뷰 어댑터 설정
        rankingAdapter = RankingAdapter(rankingList)

        // 리사이클러뷰 레이아웃 매니저 설정
        rankingRecyclerView.layoutManager = LinearLayoutManager(this)
        rankingRecyclerView.adapter = rankingAdapter
    }

    // 랭킹 목록을 임의의 데이터로 생성
    private fun createDummyRankingList(): List<User> {
        val dummyList = mutableListOf<User>()
        dummyList.add(User("John", 500))
        dummyList.add(User("Alice", 700))
        dummyList.add(User("Mike", 300))
        dummyList.add(User("Emily", 900))
        dummyList.add(User("David", 400))
        return dummyList
    }
}

