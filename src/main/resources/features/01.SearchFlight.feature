Feature: Search Penerbangan

  Scenario: TCC.001.SearchTiketPesawat.User search penerbangan
    When TCC.001.SearchTiketPesawat.User click menu tiket pesawat di dashboard
    And TCC.001.SearchTiketPesawat.User memasukkan penerbangan dari
    And TCC.001.SearchTiketPesawat.User memasukkan penerbangan ke
    And TCC.001.SearchTiketPesawat.User memasukkan tanggal berangkat
    And TCC.001.SearchTiketPesawat.User memilih pulang pergi
    And TCC.001.SearchTiketPesawat.User memasukkan jumlah penumpang
    And TCC.001.SearchTiketPesawat.User memilih kelas penerbangan
    And TCC.001.SearchTiketPesawat.User klik button search
    Then TCC.001.SearchTiketPesawat.User menampilkan penerbangan sesuai yang diinputkan